import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double[] num = new double[5];

        double soma = 0;

        for (int cont = 0; cont <= num.length-1; cont ++) {
            System.out.print("Digite a nota: ");
            double n = tec.nextDouble();

            num[cont] = n;
        }

        for (int cont = 0; cont <= num.length-1; cont ++) {
            soma += num[cont];
        }

        System.out.println("Média das notas: " + soma/5);
    }
}