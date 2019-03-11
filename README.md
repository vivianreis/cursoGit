# curso-git-cubo

Configuração inicial: <br>
--------------------------------------------------------------------------------------------------------------------------
Criar um repositório  (Transforma o diretório atual em um repositório git, criando o subdiretório “.git”) <br>
$ git init <br>


$git init <dir> (Cria o diretório e transforma em um repositório git) 
Exemplo: git init java-codigo

Deve configurar o usuário e e-mail
--------------------------------------------------------------------------------------------------------------------------
Obs: Essas informações não necessariamente precisam ser do GitGub 

Atribui o nome do usuário
$ git config --local user.name <nome>
Exemplo: git config --user.name Vivian

$ git config --local user.email <email>
Exemplo: git config --local user.email vivianmail@email.com

Configuração do Merge 
--------------------------------------------------------------------------------------------------------------------------
(Desativa o fast-foward, ou seja, cria sempre um commit na mesclagem)
$ git config --local merge.ff false 

Configurar o editor padrão que o git utilizará para mostrar as mensagens ou inseri-las no commit 
--------------------------------------------------------------------------------------------------------------------------
(Por padrão ele adota o editor do sistema operacional, no nosso caso utilizaremos o vim) 

$ git config --local core.editor <editor>
Exemplo: $ git config --local core.editor vim

$ git add . ou git add * (Adiciona as mudanças do arquivo ou do diretório para o próximo commit. O arquivo passa a ser rastreado 

Após adicionar verificar com git status

Obs: (Verificar se o local da pasta está certo)

cd .. (pra voltar na pasta) 
cd java-codigo

$ git commit –m “atualizando programa ola mundo” 

Ssh-keygen (tutorial git aula 7) 

Ir no git clicar em clone our download (copiar 

Depois dar git clone 

Git push origin Programa-Java-ola-mundo 

Git push origin master

Git checkout –b feature/java

Git push prigin feature/java
