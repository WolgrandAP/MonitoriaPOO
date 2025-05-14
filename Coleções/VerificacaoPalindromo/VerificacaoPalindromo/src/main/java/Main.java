import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Verificacao v = new Verificacao();

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String word = tec.nextLine();

        System.out.println(v.verificacaoP(word));

    }

}
