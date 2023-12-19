import java.util.Scanner;

public static void main(String[] args) {

    System.out.println("Digite o seu nome:"); // saída padrão impressa no monitor

    String nome; //local que armazena caracteres por exemplo um nome
    Scanner leitura = new Scanner(System.in); // criação do objeto para ler o teclado
    nome = leitura.nextLine(); // entrada padrão, captura o que foi digitado pelo usuário

    System.out.println("Olá " + nome + " seja bem vindo(a)");

}

