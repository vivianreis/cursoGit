import java.util.Scanner;

public static void main(String[] args) {

    //for
    for (int i = 0; i <= 100; i++) {
        System.out.println("Exemplo repetição valor i valendo: " + i);
    }

    //while
    Scanner in = new Scanner(System.in);
    var valorSecreto = 0;
    while (valorSecreto != 12345) {
        System.out.println("adivinha o valor secreto");
        valorSecreto = in.nextInt();
        if (valorSecreto == 12345) {
            System.out.println("voce acertou o valor parabéns");
        } else {
            System.out.println("não é esse o valor");
        }
    }
}
     // do/while
     public class Main {
         public static void main(String args[]) {
             int valor = 10;
             do {
                 System.out.println(valor);
                 valor++;
             } while (valor <= 50);
         }
     }


