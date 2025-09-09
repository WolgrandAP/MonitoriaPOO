import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = tec.nextInt();

        System.out.println("Digite seu peso:");
        double peso = tec.nextDouble();

        System.out.printf("Sua idade é %d e seu peso é %.2f", idade, peso);

    }

}
