import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.stream().map(n -> n * n).collect(Collectors.toList()).forEach(System.out::println);

    }
}
