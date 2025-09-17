import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = tec.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = tec.nextDouble();

        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, calculadora.soma(num1, num2));
        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, calculadora.subtracao(num1, num2));
        System.out.printf("%.2f X %.2f = %.2f\n", num1, num2, calculadora.multiplicacao(num1, num2));
        System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, calculadora.divisao(num1, num2));

    }
}