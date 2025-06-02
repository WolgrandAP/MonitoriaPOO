import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir!");

        try {
            System.out.print("Informe o primeiro valor: ");
            int x = teclado.nextInt();
            System.out.print("Informe o segundo valor: ");
            int y = teclado.nextInt();
            double r = (x / y);
            System.out.println("O resultado da soma é " + r);
        }
        catch (InputMismatchException e) {
            System.out.println("Exceção: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Exceção: " + e.getMessage());
        }

    }

}
