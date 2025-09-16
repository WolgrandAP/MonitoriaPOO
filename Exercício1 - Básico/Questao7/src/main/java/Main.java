import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = tec.nextInt();

        int numDiv = 0;

        for (int cont = 1; cont <= num; cont ++) {
            if (num%cont==0) {
                numDiv ++;
            }
        }

        if (numDiv>2) {
            System.out.println("Não é um número primo");
        } else if (numDiv==2){
            System.out.println("É um número primo");
        }

    }
}