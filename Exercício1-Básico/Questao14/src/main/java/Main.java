import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Digite um número: ");
        int num = tec.nextInt();

        for (int i = 0; i <= 9; i++) {
            if (array[i] == num) {
                System.out.printf("O número %d está na posição %d da array.", array[i], i);
                return;
            }
        }

        System.out.println("Número não achado.");
    }
}