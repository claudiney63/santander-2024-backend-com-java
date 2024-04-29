## Tutorial: Instalação do Java e Configuração da IDE Visual Studio Code

**Introdução:**

Este tutorial possui um passo a passo na instalação do Java e configuração da IDE Visual Studio Code para começar a programar em Java.

**Parte 1: Instalação do Java**

1. **Acesse o site oficial do Java:** [https://www.oracle.com/java/technologies/javase/downloads/](https://www.oracle.com/java/technologies/javase/downloads/)
2. **Selecione a versão mais recente do Java Development Kit (JDK) para seu sistema operacional.**
3. **Clique no botão "Download" e aceite os termos da licença.**
4. **Execute o arquivo baixado e siga as instruções na tela para concluir a instalação.**

**Parte 2: Configuração da Variável de Ambiente JAVA_HOME**

1. **Abra as propriedades do sistema no seu computador.**
2. **No Windows:**
    * Vá em "Painel de Controle" > "Sistema e Segurança" > "Sistema".
    * Clique em "Configurações avançadas do sistema".
    * Na guia "Variáveis de ambiente", clique em "Variáveis de sistema".
    * Na caixa "Variável", digite "JAVA_HOME".
    * Na caixa "Valor da variável", digite o caminho para a pasta de instalação do Java (geralmente C:\Program Files\Java\jdk-17.0.1).
    * Clique em "OK" para salvar as alterações.
3. **No macOS:**
    * Abra o "Terminal".
    * Digite o comando `export JAVA_HOME=/usr/libexec/java_home` e pressione Enter.
    * Digite o comando `echo $JAVA_HOME` e pressione Enter para verificar se a variável foi configurada corretamente.
4. **No Linux:**
    * Abra o arquivo `/etc/profile` em um editor de texto.
    * Adicione a seguinte linha ao final do arquivo: `export JAVA_HOME=/usr/lib/jvm/java-17`
    * Salve o arquivo e feche o editor.
    * Execute o comando `source /etc/profile` para aplicar as alterações.

**Parte 3: Instalação da Extensão Java para Visual Studio Code**

1. **Abra o Visual Studio Code.**
2. **Vá em "Extensões" > "Pesquisar extensões".**
3. **Procure por "Java" e instale a extensão "Java" da Microsoft.**
4. **Reinicie o Visual Studio Code para que a extensão seja ativada.**

**Parte 4: Verificação da Instalação**

1. **Abra o Visual Studio Code e crie um novo arquivo com a extensão ".java".**
2. **Digite um código Java simples, como o seguinte:**

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

3. **Salve o arquivo.**
4. **Pressione `Ctrl+Shift+P` (Windows) ou `Cmd+Shift+P` (macOS) para abrir a paleta de comandos.**
5. **Digite "Java: Run Code" e pressione Enter.**
6. **O Visual Studio Code deve compilar e executar o código, exibindo a seguinte mensagem no console:**

```
Hello, World!
```

**Parabéns!** Você instalou o Java com sucesso e configurou o Visual Studio Code para programar em Java.
