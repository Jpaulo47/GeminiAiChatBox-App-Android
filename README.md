# Gemini AI Chat Box

Este é um aplicativo Android que utiliza a tecnologia Jetpack Compose e integra um modelo generativo de IA para fornecer respostas a perguntas dos usuários, acompanhadas de imagens.

## Demonstração

<table>
  <tr>
    <td><img src="https://github.com/Jpaulo47/GeminiAiChatBox-App-Android/blob/main/demo3.jpg" alt="Descrição da Imagem 1"width="200"></td>
    <td><img src="https://github.com/Jpaulo47/GeminiAiChatBox-App-Android/blob/main/demo1.jpg" alt="Descrição da Imagem 2"width="200"></td>
    <td><img src="https://github.com/Jpaulo47/GeminiAiChatBox-App-Android/blob/main/demo2.jpg" alt="Descrição da Imagem 3"width="200"></td>
  </tr>
</table>

## Funcionalidades

- **Perguntas com Imagens:** Os usuários podem fazer perguntas acompanhadas por imagens.
- **Respostas Geradas:** O modelo generativo de IA gera respostas com base nas entradas do usuário.
- **Carregamento Eficiente de Imagens:** Utiliza a biblioteca [Coil](https://coil-kt.github.io/coil/) para carregar e exibir imagens de forma eficiente.

## Como Executar

### Siga estas etapas para executar o aplicativo localmente:

 - Clone o repositório:
 - git clone [https://github.com/seu-usuario/geminiaichatbox.git](https://github.com/Jpaulo47/GeminiAiChatBox-App-Android.git)
 - Abra o projeto no Android Studio.
 - Execute o aplicativo em um emulador ou dispositivo Android.
   
Para executar o aplicativo corretamente, é necessário obter uma chave de API do site https://ai.google.dev/ e configurá-la no arquivo local.properties. Siga as etapas abaixo:

 - Copie a chave de API gerada.
 - No diretório raiz do projeto, crie um arquivo chamado local.properties se ainda não existir.
 - Abra o arquivo *local.properties* e adicione a seguinte linha, substituindo (SuaChaveDeAPI) pela chave de API copiada:
   
<pre>
apiKey=(SuaChaveDeAPI)
</pre>

## Bibliotecas e Tecnologias Utilizadas
 - Jetpack Compose
 - Coil
 - Google AI SDK
 - Gradle Secrets Plugin
 - ViewModel
 - Coroutines
   
## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.
