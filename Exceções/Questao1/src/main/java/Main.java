public class Main {

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5};
        int[] den = {1,2,3,0,5};

        try {
           for (int i = 0; i< num.length; i++) {
               int div = num[i]/den[i];
               System.out.printf("Divisão: %d/%d = %d", num[i], den[i], div);
               System.out.println();
           }
        }
        finally {
            System.out.println("Independente se haverá exception, essa linha será executada. O bloco finally sempre é executado quando o bloco try é termina.");
        }
    }
}
