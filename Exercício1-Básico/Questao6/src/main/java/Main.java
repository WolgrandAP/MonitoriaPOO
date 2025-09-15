import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um número para a tabuada: ");
        int num = tec.nextInt();

        for (int cont = 0; cont <= 10; cont++) {
            int res = cont * num;
            System.out.printf("%d X %d = %d \n", cont, num, res);
        }

    }
}