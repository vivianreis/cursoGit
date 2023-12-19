public static void main(String[] args) {

    // AND
    boolean a = true;
    boolean b = false;
    if (a && b) {
        // Este código não será executado, já que a é verdadeiro e b é falso.
    }

    // OR
    boolean c = true;
    boolean d = false;
    if (c || d) {
        // Este código será executado, já que c é verdadeiro, mesmo que d seja falso.
    }

    // NOT (!)
    boolean e = true;
    if (!e) {
        // Este código não será executado, já que e é verdadeiro.
    }

}

