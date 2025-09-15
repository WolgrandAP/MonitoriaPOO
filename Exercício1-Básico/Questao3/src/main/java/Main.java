import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = tec.nextInt();

        System.out.println();

        if (idade >= 18) {
            System.out.println("Você é de maior");
        } else {
            System.out.println("Você é de menor");
        }

    }
}