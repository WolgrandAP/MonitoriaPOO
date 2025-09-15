import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = tec.nextLine();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("A letra é uma vogal");
        } else {
            System.out.println("A letra é uma consoante");
        }

    }
}