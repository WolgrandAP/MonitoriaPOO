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

        List<Pessoa> filtro = pessoas.stream().filter(i -> i.getIdade()<30).collect(Collectors.toList());

        System.out.println("Pessoas com menos de 30 anos:");
        for (Pessoa pessoa : filtro) {
            System.out.printf("Nome: %s - Idade: %d", pessoa.getNome(), pessoa.getIdade());
        }

    }

}