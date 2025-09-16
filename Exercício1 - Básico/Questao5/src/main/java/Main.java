public class Main {

    public static void main(String[] args) {

        int cont = 1;
        int somaPares = 0;

        while (cont<=100) {
            if (cont%2==0) {
                somaPares += cont;
            }

            cont ++;
        }

        System.out.println(somaPares);

    }
}