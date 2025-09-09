import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 30),
                new Pessoa("Bob", 25),
                new Pessoa("Charlie", 35)
        );

        List<String> nomes = pessoas.stream().map(Pessoa::getNome).collect(Collectors.toList());
        System.out.println(nomes);

    }

}
