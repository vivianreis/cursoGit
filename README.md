# curso-git-cubo

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
$ git init <br>


$git init <dir> (Cria o diretório e transforma em um repositório git) 
Exemplo: git init java-codigo

Deve configurar o usuário e e-mail
--------------------------------------------------------------------------------------------------------------------------
Obs: Essas informações não necessariamente precisam ser do Github 

Atribui o nome do usuário
$ git config --local user.name <nome>
Exemplo: git config --user.name vivian

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

Ir no git clicar em clone ou download (copiar url gerada)

Depois dar git clone 

Git push origin Programa-Java-ola-mundo 

Git push origin master

Git checkout –b feature/java

Atualizar o repositório:
------------------------------------------------------------------------------------------------------------------------------------
Atualiza todos os dados do repositório, ou seja, realiza um fetch seguido de um merge.

git pull 



