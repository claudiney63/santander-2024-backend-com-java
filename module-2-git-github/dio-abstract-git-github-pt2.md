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