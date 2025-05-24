import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 30),
                new Pessoa("Bob", 25),
                new Pessoa("Charlie", 35)
        );

        double media = pessoas.stream().mapToInt(p -> p.getIdade()).average().orElse(0);

        System.out.println("A média das idades: " + media);

    }

}
