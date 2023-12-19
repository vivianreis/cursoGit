public static void main(String[] args) {

    // if/else
        int resposta = 10;
        if (resposta == 10) {
            System.out.println("A resposta é exatamente 10!");
        } else if (resposta > 10) {
            System.out.println("A resposta é maior que 10!");
        } else {
            System.out.println("A resposta é menor que 10!");
        }
    // switch/case
    int dia = 3;
    String nomeDia;
    switch (dia) {
        case 1:
            nomeDia = "domingo";
            break;
        case 2:
            nomeDia = "segunda-feira";
            break;
        case 3:
            nomeDia = "terça-feira";
            break;
        case 4:
            nomeDia = "quarta-feira";
            break;
        case 5:
            nomeDia = "quinta-feira";
            break;
        case 6:
            nomeDia = "sexta-feira";
            break;
        case 7:
            nomeDia = "sábado";
            break;
        default:
            nomeDia = "Dia inválido";
            break;
    }

    System.out.println("O dia " + dia + " é " + nomeDia);
    }

