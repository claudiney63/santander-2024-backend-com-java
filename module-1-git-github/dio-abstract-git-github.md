## Aula - Salvando Alterações no Repositório Local

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

## Aula - Desfazendo Alterações no Repositório Local

**Introdução**

Nesta aula, abordaremos os comandos Git para desfazer alterações no repositório local. O Git oferece diversas ferramentas para reverter mudanças em arquivos, commits e até mesmo o histórico do repositório. Compreender essas ferramentas é crucial para lidar com erros, voltar a um estado anterior do projeto ou realizar ajustes finos no histórico de commits.

**Comandos Git para Desfazer Alterações**

### `git restore`

O comando `git restore` permite restaurar um arquivo ou pasta para um estado anterior, mesmo que o arquivo não tenha sido adicionado ao staging area. Ele não altera o histórico de commits.

**Sintaxe:**

```bash
git restore <caminho_do_arquivo> [<revisao>]
```

**Exemplo:**

```bash
git restore arquivo.txt HEAD~1 # Restaura o arquivo "arquivo.txt" para a revisão anterior (HEAD~1)
```

### `git reset`

O comando `git reset` é mais abrangente que o `git restore` e permite desfazer alterações em arquivos, commits e até mesmo o histórico do repositório.

**Sintaxe:**

```bash
git reset <revisao> [--soft] [--mixed] [--hard]
```

**Opções:**

* `--soft` (padrão): Desfaz as alterações no staging area e nos commits subsequentes, mas mantém os arquivos modificados no disco de trabalho.
* `--mixed`: Desfaz as alterações no staging area e nos commits subsequentes, mas preserva as alterações nos arquivos modificados no disco de trabalho.
* `--hard`: Desfaz as alterações no staging area, nos commits subsequentes e nos arquivos modificados no disco de trabalho.

**Exemplo:**

```bash
git reset HEAD~2 --mixed # Desfaz as alterações no staging area e nos commits subsequentes, mas preserva as alterações nos arquivos modificados no disco de trabalho dos últimos 2 commits.
```

**Observações:**

* O uso do `git reset` com cuidado, pois pode levar à perda de dados não confirmados.
* Utilize o `git log` para verificar o histórico de commits antes de usar o `git reset`.

### `git commit --amend`

O comando `git commit --amend` permite modificar o último commit, alterando a mensagem do commit ou adicionando arquivos esquecidos.

**Sintaxe:**

```bash
git commit --amend [-m <nova_mensagem>]
```

**Exemplo:**

```bash
git commit --amend -m "Mensagem do commit atualizada" # Atualiza a mensagem do último commit.
```

### `git reflog`

O comando `git reflog` exibe o histórico de todos os HEADs do repositório, incluindo commits descartados e alterações no HEAD.

**Sintaxe:**

```bash
git reflog
```

**Exemplo:**

```bash
git reflog # Exibe o histórico de todos os HEADs do repositório.
```

### `git status`

O comando `git status` fornece informações sobre o estado do repositório, incluindo arquivos modificados, novos arquivos e arquivos ignorados.

**Sintaxe:**

```bash
git status
```

**Exemplo:**

```bash
git status # Exibe o estado do repositório.
```

**Práticas Recomendadas**

* Utilize o `git restore` para restaurar arquivos específicos para um estado anterior.
* Utilize o `git reset` com cuidado, especialmente com a opção `--hard`, pois pode levar à perda de dados não confirmados.
* Utilize o `git commit --amend` para modificar o último commit de forma segura.
* Utilize o `git reflog` para recuperar um HEAD descartado acidentalmente.
* Utilize o `git status` frequentemente para verificar o estado do repositório e identificar arquivos modificados ou esquecidos.