import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Contagem c = new Contagem();

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String text = tec.nextLine();

        c.contar(text.toLowerCase());

    }

}
