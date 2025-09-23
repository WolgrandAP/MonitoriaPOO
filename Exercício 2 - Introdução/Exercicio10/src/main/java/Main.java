import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite o valor a: ");
        int a = tec.nextInt();

        System.out.print("\nDigite o valor b: ");
        int b = tec.nextInt();

        try {
            double div = a/b;
            System.out.printf("Resultado da divisão (a/b) : %d / %d = %.2f", a, b, div);
        } catch (ArithmeticException e) {
            System.out.println("Erro, divisor igual a zero: " + e.getMessage());
        }


    }
}