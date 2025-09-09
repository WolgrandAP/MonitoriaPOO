import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int soma = numeros.stream().mapToInt(n -> n.intValue()).sum();
        System.out.println("A soma  de todos os elementos é " + soma);

    }

}
