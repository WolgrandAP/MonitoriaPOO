import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int contador = 0;

        System.out.print("Digite uma frase: ");
        String frase = tec.nextLine();

        String fraseMinuscula = frase.toLowerCase().replace(" ", "");

        for (int i = 0; i <= fraseMinuscula.length()-1; i++) {
            char letra = fraseMinuscula.charAt(i);

            /*
            'a' (aspas simples) → é um char
            "a" (aspas duplas) → é uma String
            */
            if (letra == 'a') {
                contador++;
            }
        }

        System.out.println("Quantidade de A/a: " + contador);
    }
}