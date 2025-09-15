import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = tec.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = tec.nextInt();

        System.out.println("Soma: " + (n1 + n2));

        System.out.println("Subtração: " + (n1 - n2));

        System.out.println("Multiplicação: " + (n1 * n2));

        // A divisão retorna a parte inteira da divisão
        System.out.println("Divisão: " + (n1/n2));

    }

}
