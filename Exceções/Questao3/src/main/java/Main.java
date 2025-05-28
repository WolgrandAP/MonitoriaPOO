public class Main {

    //O complador não permite colocar um catch mais específico depois de um catch mais genérico, logo não compila. E desta forma está errado.

    public static void main(String[] args) {

        int[] num = {1,4,6,10};
        int[] den = {5,6,3};

        try {
            for (int i = 0; i< num.length; i++) {
                System.out.printf("Divisão: %d/%d = %d", num[i], den[i], num[i]/den[i]);
                System.out.println();
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        catch (ArithmeticException a) {
            a.printStackTrace();
        }

    }

}
