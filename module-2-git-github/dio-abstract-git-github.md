## Salvando Alterações no Repositório Local

**Introdução**

Nesta aula, abordaremos como salvar as alterações feitas nos arquivos do seu projeto no repositório local Git. O processo de salvar as alterações é fundamental para manter um histórico completo das modificações realizadas no projeto e permitir a colaboração eficiente com outros desenvolvedores.

**Etapas para Salvar Alterações**

1. **Verificar o Status das Alterações:**

   Antes de salvar as alterações, é importante verificar quais arquivos foram modificados desde o último commit. Para isso, utilize o comando `git status`:

   ```bash
   git status
   ```

   Este comando exibirá uma lista dos arquivos modificados, novos e excluídos, além de indicar o estado de cada um.

2. **Adicionando Arquivos para Commit:**

   Para salvar as alterações de um arquivo, é necessário adicioná-lo ao próximo commit. Utilize o comando `git add` seguido do nome do arquivo:

   ```bash
   git add <nome_do_arquivo>
   ```

   Você também pode adicionar vários arquivos de uma só vez utilizando curingas:

   ```bash
   git add *.py # Adiciona todos os arquivos com extensão .py
   ```

3. **Criando um Commit:**

   Após adicionar os arquivos desejados, você pode criar um commit utilizando o comando `git commit`. Este comando permite incluir uma mensagem descritiva sobre as alterações realizadas:

   ```bash
   git commit -m "Mensagem descritiva do commit"
   ```

   A mensagem do commit deve ser clara e concisa, descrevendo as principais mudanças feitas nos arquivos.

4. **Verificando o Histórico de Commits:**

   Para visualizar o histórico de commits do seu repositório, utilize o comando `git log`:

   ```bash
   git log
   ```

   Este comando exibirá uma lista dos commits realizados, incluindo a mensagem, data e autor de cada um.

5. **Criando o Arquivo .gitignore**

    O arquivo `.gitignore` deve ser criado na raiz do seu repositório Git. Você pode utilizar qualquer editor de texto para criá-lo.

    Cada linha no arquivo `.gitignore` representa um padrão a ser ignorado. O Git utiliza padrões globais para identificar os arquivos que devem ser ignorados.

    * **Padrões Simples:**

    - `arquivo.txt`: Ignora o arquivo `arquivo.txt`.
    - `pasta/`: Ignora todos os arquivos e subpastas dentro da pasta `pasta`.

    * **Caracteres curinga:**

    - `*.txt`: Ignora todos os arquivos com extensão `.txt`.
    - `pasta/*`: Ignora todos os arquivos dentro da pasta `pasta`, mas não as subpastas.

    * **Negação:**

    - `!arquivo.txt`: Inclui o arquivo `arquivo.txt` no versionamento, mesmo que ele corresponda a outro padrão de ignorar.

**Práticas Recomendadas**

* **Commits Frequentes:** É recomendável realizar commits frequentes, mesmo que as alterações sejam pequenas. Isso facilita o acompanhamento do histórico do projeto e a recuperação de versões anteriores, caso necessário.
* **Mensagens de Commit Descritivas:** Utilize mensagens de commit claras e concisas para descrever as mudanças realizadas. Isso facilita a compreensão do histórico do projeto e a identificação de problemas específicos.
* **Organização dos Arquivos:** Mantenha seus arquivos organizados e utilize nomes descritivos para facilitar a navegação e o gerenciamento do projeto.

**Recursos Adicionais**

* Documentação Git: [https://git-scm.com/docs/git-status](https://git-scm.com/docs/git-status)
* Comando Git Add: [https://git-scm.com/docs/git-add](https://git-scm.com/docs/git-add)
* Comando Git Commit: [https://git-scm.com/docs/git-commit](https://git-scm.com/docs/git-commit)
* Comando Git Log: [https://git-scm.com/docs/git-log](https://git-scm.com/docs/git-log)
