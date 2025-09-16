import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int[] num = {2, 4, 8, 1, 80, 11, 6, 78};

        System.out.print("Digite um número: ");
        int n = tec.nextInt();

        for (int cont = 0; cont <= num.length-1; cont ++) {
            if (num[cont]==n) {
                System.out.println(n + " está no array.");
                return;
            }
        }

        System.out.println(n + " não está no array.");
    }
}