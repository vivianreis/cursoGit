# curso-git

Resumão de passos para subir os exercicios: <br>
--------------------------------------------------------------------------------------------------------------------------
- Primeiro cria um repositorio aqui no git
- Cria no computador uma pasta ghr-projeto (ghr significa github repository)
- Entra dentro dessa pasta e abre o terminal (botão direito Git bash here caso tenha o git bash)
- No terminal (gosto do git bash) digita git clone http........(link do repositorio que vc criou anteriormente)
- No terminal da um "ls" pra listar onde vc está (vai precisar entrar mais pasta dentro digitando cd + tab + enter vc entra na pasta)
- Volta no seu computador copia os exercicios/arquivos que vc quer que suba no git e cola dentro da pasta (na pasta vai ter só um arquivo .git e um readme cola em baixo os exercicios)
- volta no terminal e escreve git status (vc vai ver que vai estar verdinho os arquivos que vc colocou)
- git add . (para adicionar)
- git commit -m (vc insere um comentário ex git commit -m "exercicios de lógica")
- git push origin master (vc dá um "push" e sobe seus exercícios no git)

Configuração inicial: <br>
--------------------------------------------------------------------------------------------------------------------------
Criar um repositório  (Transforma o diretório atual em um repositório git, criando o subdiretório “.git”) <br>
```bash
$git init (Cria o diretório e transforma em um repositório git) 
Exemplo: git init java-codigo
```

Deve configurar o usuário e e-mail
--------------------------------------------------------------------------------------------------------------------------
Obs: Essas informações não necessariamente precisam ser do Github 

Atribui o nome do usuário
```bash
$ git config --local user.name <nome>
Exemplo: git config --user.name vivian
```

Atribui o email do usuário
```bash
$ git config --local user.email <email>
Exemplo: git config --local user.email vivian@email.com
```


Configuração do Merge 
--------------------------------------------------------------------------------------------------------------------------
```bash
$ git config --local merge.ff false 
```

(Desativa o fast-foward, ou seja, cria sempre um commit na mesclagem)

Configurar o editor padrão que o git utilizará para mostrar as mensagens ou inseri-las no commit 
--------------------------------------------------------------------------------------------------------------------------
(Por padrão ele adota o editor do sistema operacional, no nosso caso utilizaremos o vim) 

```bash
$ git config --local core.editor <editor>
Exemplo: $ git config --local core.editor vim

$ git add . ou git add * (Adiciona as mudanças do arquivo ou do diretório para o próximo commit. O arquivo passa a ser rastreado 

Após adicionar verificar com git status

Obs: (Verificar se o local da pasta está certo)

cd .. (pra voltar na pasta) 
cd java-codigo

$ git commit –m “atualizando programa ola mundo” 

Ssh-keygen (tutorial git aula 7) 

Ir no git clicar em clone ou download (copiar url gerada)

Depois dar git clone 

Git push origin Programa-Java-ola-mundo 

Git push origin master
``` 

Branchs:
------------------------------------------------------------------------------------------------------------------------------------
```bash
git branch - Para verificar suas branches (dando esse comando ele lista os branches locais da sua máquina. Branch significa "ramo")
git branch + nome branch (cria uma branch)
git checkout –b + nome branch (além de criar a branch ele já entra dentro dela)
```
Obs: Cada empresa adota uma regra diferente para gerenciamento de branchs grande parte usa o padrão do git flow (master - develop - features)
- Master - É a produção.
- Develop - É uma camada(branch) criada a partir da master
- Feature - É uma camada(branch) criada a partir da develop 

Como padrão de nome de branch (varia de empresa para empresa) geralmente usam feature/nome-da-branch 
exemplo criação de uma feature: git checkout -b feature/criando-camada-de-seguranca

```bash
git branch -D nome-da-branch
``` 

Obs: -D comando para deletar uma branch, é importante lembrar que para deletar a branch vc não pode estar na branch deve estar uma camada acima)

Meu colega criou uma branch e deu um push consigo ver a branch no Github mas não vejo na minha máquina local, como faço para usar essa branch na minha maquina local?
R: git checkout + nome-da-branch-do-colega importante dar git pull sempre para manter atualizado o local com a master/develop.

Atualizar o repositório:
------------------------------------------------------------------------------------------------------------------------------------
Atualiza todos os dados do repositório, ou seja, realiza um fetch seguido de um merge.
```bash
git pull 
```

Renomear um repositório:
------------------------------------------------------------------------------------------------------------------------------------
Para renomear um repositorio você pode fazer isso utilizando o seguinte comando:
```bash
git branch -m novo-nome
```
ou também pode renomear um branch local a partir de outro branch usando os comandos abaixo:
```bash
git checkout master
git branch -m nome-antigo novo-nome
```
e para verificar se eles foi renomeado usar o seguinte comando: (ele vai listar tanto os branchs locais como também os branchs remotos)
```bash
git branch -a
```





