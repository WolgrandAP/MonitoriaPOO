public class Main {

    public static void main(String[] args) throws InterruptedException {

        for (int cont = 10; cont >= 0; cont --) {
            System.out.println(cont);
            Thread.sleep(1000); //Em 1000 milisegundos = 1s
        }

    }
}