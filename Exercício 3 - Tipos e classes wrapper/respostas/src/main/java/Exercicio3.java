import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = tec.nextInt();

        String binario = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num);
        String hexa = Integer.toHexString(num);

        System.out.printf("Número %d em binário: %s\n", num, binario);
        System.out.printf("Número %d em octal: %s\n", num, octal);
        System.out.printf("Número %d em hexa: %s", num, hexa);
    }
}