public static void main(String[] args) {

    //pré incremento
    int numero = 5;
    int resultado1 = ++numero; //num é incrementado para 6 e depois atribuído a resultado
    System.out.println(numero); // imprime 6
    System.out.println(resultado1); // imprime 6

    //pós incremento
    int valor = 5;
    int resultado2 = valor++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
    System.out.println(valor); // imprime 6
    System.out.println(resultado2); // imprime 5

}

