public class Main {

    public static void main(String[] args) {

        String[] frutas = {"maçã", "banana", "morango", "uva", "peira"};

        for (int cont = 0; cont < 5; cont++) {
            for (int i = 0; i < 1; i++) {
                char inicial = frutas[cont].toLowerCase().charAt(i);
                if (inicial == 'm') {
                    System.out.println(frutas[cont]);
                }
            }
        }
    }
}