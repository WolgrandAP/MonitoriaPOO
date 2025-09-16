import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = tec.nextLine();

        String invertida = "";

        for (int cont = palavra.length()-1; cont >= 0; cont--) {
            invertida += palavra.charAt(cont);
        }

        System.out.println(invertida);
    }
}