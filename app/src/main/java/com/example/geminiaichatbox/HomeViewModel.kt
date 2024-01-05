package com.example.geminiaichatbox

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import com.google.ai.client.generativeai.type.generationConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel(){

    private val _uiState: MutableStateFlow<HomeUIState> = MutableStateFlow(HomeUIState.Initial)
    val uiState = _uiState.asStateFlow()

    private var generativeModel: GenerativeModel

    init {
        val config = generationConfig{
            temperature = 0.90f
        }

         generativeModel = GenerativeModel(
            modelName = "gemini-pro-vision",
            apiKey = BuildConfig.apiKey,
            generationConfig = config
        )
    }

    fun questioning(userInput: String, selectedImages: List<Bitmap>) {
        _uiState.value = HomeUIState.Loading
        val prompt = "Take a look at images, and then answer the following question: $userInput"

        viewModelScope.launch(Dispatchers.IO) {
            try {
                val content = content {
                    for (image in selectedImages) {
                        image(image)
                    }
                    text(prompt)
                }

                var output = ""
                generativeModel.generateContentStream(content).collect {
                    output += it.text
                    _uiState.value = HomeUIState.Success(output)
                }

            } catch (e: Exception) {
                _uiState.value = HomeUIState.Error(e.localizedMessage ?: "Error in generating content")
            }
        }

    }
}


sealed interface HomeUIState{
    object Initial: HomeUIState
    object Loading: HomeUIState
    data class Error(val message: String): HomeUIState
    data class Success(val message: String): HomeUIState
}