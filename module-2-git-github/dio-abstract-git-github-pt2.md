## Aula - Enviando e Baixando Alterações com o Repositório Remoto

**Introdução**

Nesta aula, abordaremos os comandos Git para enviar e baixar alterações entre o repositório local e o repositório remoto, como o GitHub. A colaboração em projetos de software envolve a sincronização das alterações entre os repositórios de diferentes desenvolvedores. O Git oferece ferramentas eficientes para realizar essa tarefa de forma organizada e segura.

**Conectando ao Repositório Remoto**

### `git remote add`

O comando `git remote add` é utilizado para adicionar um repositório remoto ao seu repositório local. Isso permite que você envie e receba alterações do repositório remoto.

**Sintaxe:**

```bash
git remote add <nome_remoto> <url_repositorio_remoto>
```

**Exemplo:**

```bash
git remote add origin https://github.com/usuario/repositorio.git # Adiciona o repositório remoto "origin" com a URL especificada.
```

**Verificando os Repositórios Remotos**

Para verificar os repositórios remotos adicionados ao seu repositório local, utilize o comando:

```bash
git remote -v
```

**Configurando o Branch Remoto para Push**

### `git branch -M main`

O comando `git branch -M main` configura o branch local `main` para ser rastreado pelo branch remoto `origin/main`. Isso significa que, ao realizar um push, as alterações do seu branch local `main` serão enviadas para o branch remoto `origin/main`.

**Sintaxe:**

```bash
git branch -M main
```

**Exemplo:**

```bash
git branch -M main # Configura o branch local "main" para ser rastreado pelo branch remoto "origin/main".
```

**Enviando Alterações para o Repositório Remoto**

### `git push -u origin main`

O comando `git push -u origin main` envia as alterações do seu branch local `main` para o repositório remoto `origin` e configura o upstream do branch local `main` para o branch remoto `origin/main`. Isso significa que futuros pushes serão realizados automaticamente para o branch remoto correto.

**Sintaxe:**

```bash
git push -u origin main
```

**Exemplo:**

```bash
git push -u origin main # Envia as alterações do branch local "main" para o repositório remoto "origin" e configura o upstream do branch local "main" para o branch remoto "origin/main".
```

**Baixando Alterações do Repositório Remoto**

### `git pull`

O comando `git pull` busca as alterações do repositório remoto e as incorpora no repositório local. Isso permite que você obtenha as últimas modificações feitas por outros desenvolvedores.

**Sintaxe:**

```bash
git pull
```

**Exemplo:**

```bash
git pull # Busca as alterações do repositório remoto e as incorpora no repositório local.
```

**Resolução de Conflitos**

Em alguns casos, ao baixar alterações do repositório remoto, podem surgir conflitos de merge. Isso ocorre quando as mesmas linhas de código foram modificadas por diferentes desenvolvedores. O Git irá parar a execução e solicitar que você resolva os conflitos manualmente.

**Práticas Recomendadas**

* Utilize o `git remote add` para adicionar o repositório remoto ao seu projeto local.
* Configure o branch remoto para push utilizando o `git branch -M main`.
* Envie suas alterações para o repositório remoto com o `git push -u origin main`.
* Utilize o `git pull` para buscar as alterações do repositório remoto e evitar conflitos de merge.
* Resolva os conflitos de merge manualmente com cuidado.
* Comunique-se com outros desenvolvedores sobre as alterações realizadas para evitar conflitos.


## Aula - Trabalhando com Branches: Criando, Mesclando, Deletando e Tratando Conflitos

**Introdução**

Nesta aula, aprofundaremos o conhecimento sobre branches no Git, abordando comandos para criar, mesclar, excluir e resolver conflitos de branches. O uso eficiente de branches é crucial para organizar o fluxo de trabalho em projetos de software, permitindo que você trabalhe em diferentes features ou correções de bugs sem afetar o código principal do projeto.

**Comandos Básicos de Branches**

### `git branch`

O comando `git branch` lista todos os branches existentes no seu repositório local, incluindo o branch atual e branches remotos.

**Sintaxe:**

```bash
git branch
```

**Exemplo:**

```bash
git branch # Lista todos os branches existentes no repositório local.
```

### `git branch -v`

O comando `git branch -v` lista todos os branches existentes no repositório local, incluindo o branch atual e branches remotos, além de mostrar o último commit de cada branch.

**Sintaxe:**

```bash
git branch -v
```

**Exemplo:**

```bash
git branch -v # Lista todos os branches existentes no repositório local, incluindo o último commit de cada branch.
```

### `git branch -d`

O comando `git branch -d` permite excluir um branch local.

**Sintaxe:**

```bash
git branch -d <nome_do_branch>
```

**Exemplo:**

```bash
git branch -d feature/nova_funcionalidade # Exclui o branch local "feature/nova_funcionalidade".
```

**Observações:**

* Utilize o `git branch -d -D <nome_do_branch>` para excluir um branch local, mesmo que ele tenha commits não mesclados.
* Não é possível excluir o branch atual.

**Criando Branches**

Para criar um novo branch, utilize o comando `git branch`.

**Sintaxe:**

```bash
git branch <nome_do_branch>
```

**Exemplo:**

```bash
git branch feature/correcao_bug # Cria um novo branch local chamado "feature/correcao_bug".
```

**Trocando de Branches**

Para trocar para um branch diferente, utilize o comando `git checkout`.

**Sintaxe:**

```bash
git checkout <nome_do_branch>
```

**Exemplo:**

```bash
git checkout feature/nova_funcionalidade # Troca para o branch local "feature/nova_funcionalidade".
```

**Mesclando Branches**

O comando `git merge` permite mesclar as alterações de um branch em outro branch.

**Sintaxe:**

```bash
git merge <nome_do_branch>
```

**Exemplo:**

```bash
git merge feature/correcao_bug # Mescla as alterações do branch local "feature/correcao_bug" no branch atual.
```

**Resolução de Conflitos de Merge**

Em alguns casos, ao mesclar branches, podem surgir conflitos de merge. Isso ocorre quando as mesmas linhas de código foram modificadas em branches diferentes. O Git irá parar a execução e solicitar que você resolva os conflitos manualmente.

**Tratando Conflitos de Merge:**

1. Identifique as linhas de código em conflito.
2. Edite os arquivos manualmente para resolver os conflitos.
3. Adicione os arquivos modificados ao staging area.
4. Confirme a resolução do conflito com o comando `git add` e `git commit`.

**Práticas Recomendadas**

* Utilize branches para trabalhar em features ou correções de bugs específicas.
* Evite trabalhar em código crítico no branch principal.
* Realize merges frequentes para evitar acúmulo de alterações em diferentes branches.
* Resolva conflitos de merge com cuidado e atenção.
* Utilize ferramentas de visualização de diff para facilitar a resolução de conflitos.
* Comunique-se com outros desenvolvedores sobre as alterações realizadas em branches específicos.


## Aula - Trabalhando com Branches - Comandos Úteis no Dia a Dia

**Introdução**

Nesta aula, complementaremos o conhecimento sobre branches no Git, abordando comandos práticos para auxiliar no seu dia a dia como desenvolvedor. Dominar esses comandos te permitirá trabalhar com branches de forma mais eficiente, otimizando seu workflow e evitando problemas comuns.

**Comandos para Buscar e Visualizar Alterações**

### `git fetch`

O comando `git fetch` busca as informações dos repositórios remotos, mas não mescla as alterações no repositório local. Isso permite que você visualize as últimas modificações feitas por outros desenvolvedores antes de decidir se deseja mesclá-las no seu projeto.

**Sintaxe:**

```bash
git fetch
```

**Exemplo:**

```bash
git fetch # Busca as informações do repositório remoto "origin".
```

### `git diff`

O comando `git diff` exibe as diferenças entre o seu branch local e outro branch ou o último commit. Isso é útil para analisar as alterações feitas em um branch antes de mesclá-lo no seu projeto ou para verificar se você esqueceu de adicionar algum arquivo ao staging area.

**Sintaxe:**

```bash
git diff <nome_do_branch> [<caminho_do_arquivo>]
```

**Exemplo:**

```bash
git diff feature/nova_funcionalidade # Exibe as diferenças entre o branch local "feature/nova_funcionalidade" e o branch atual.
git diff HEAD~1 # Exibe as diferenças entre o último commit e o anterior.
```

**Comandos para Gerenciar Branches e Commits**

### `git merge`

O comando `git merge` mescla as alterações de um branch em outro branch. Já o abordamos na aula anterior, mas vale ressaltar que este comando é crucial para integrar as modificações de diferentes branches no seu projeto.

**Sintaxe:**

```bash
git merge <nome_do_branch>
```

**Exemplo:**

```bash
git merge feature/correcao_bug # Mescla as alterações do branch local "feature/correcao_bug" no branch atual.
```

### `git clone --branch --single-branch`

O comando `git clone --branch --single-branch` clona um repositório remoto em um novo diretório, checkoutando um branch específico em vez do branch principal. Isso pode ser útil para trabalhar em um branch específico sem clonar o repositório completo.

**Sintaxe:**

```bash
git clone --branch <nome_do_branch> --single-branch https://github.com/<usuario>/<repositorio>.git <diretorio_destino>
```

**Exemplo:**

```bash
git clone --branch feature/nova_funcionalidade --single-branch https://github.com/usuario/repositorio.git novo_projeto # Clona o repositório "https://github.com/usuario/repositorio.git" no diretório "novo_projeto" e checkout o branch "feature/nova_funcionalidade".
```

### `git stash`

O comando `git stash` permite guardar as alterações não confirmadas do seu branch em um "stash", que pode ser recuperado posteriormente. Isso é útil para guardar seu trabalho em andamento temporariamente, enquanto você muda para outro branch ou resolve um problema.

**Sintaxe:**

```bash
git stash [opcional: -m "mensagem de descrição"]
```

**Exemplo:**

```bash
git stash -m "Trabalho em andamento na feature/nova_funcionalidade" # Guarda as alterações não confirmadas no branch atual em um stash com a mensagem "Trabalho em andamento na feature/nova_funcionalidade".
```

### `git stash list`

O comando `git stash list` lista todos os stashes armazenados no seu repositório local.

**Sintaxe:**

```bash
git stash list
```

**Exemplo:**

```bash
git stash list # Lista todos os stashes armazenados no repositório local.
```

### `git stash top`

O comando `git stash top` aplica o último stash no seu branch atual.

**Sintaxe:**

```bash
git stash top
```

**Exemplo:**

```bash
git stash top # Aplica o último stash no branch atual.
```

### `git stash apply`

O comando `git stash apply` aplica o stash especificado no seu branch atual.

**Sintaxe:**

```bash
git stash apply <numero_do_stash>
```

**Exemplo:**

```bash
git stash apply 1 # Aplica o stash de número 1 no branch atual.
```

### `git checkout` 

O comando `git checkout` troca para um branch existente. 

**Sintaxe:**

```bash
git checkout <nome_do_branch>
```

**Exemplo:**

```bash
git checkout feature/nova_funcionalidade # Troca para o branch local "feature/nova_funcionalidade".
```

### `git checkout -b` 

O comando `git checkout -b` cria um novo branch e troca para ele simultaneamente. Isso é um atalho para executar `git branch` seguido de `git checkout`.

**Sintaxe:**

```bash
git checkout -b <nome_do_branch>
```

**Exemplo:**

```bash
git checkout -b hotfix/bug_critico # Cria um novo branch local chamado "hotfix/bug_critico" e troca para ele.
```