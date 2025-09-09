import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 30),
                new Pessoa("Bob", 25),
                new Pessoa("Charlie", 35)
        );

        Optional<Pessoa> filtro = pessoas.stream().max(Comparator.comparingInt(Pessoa::getIdade));

        Pessoa maisVelha = filtro.get();

        System.out.printf("Nome: %s - Idade: %d", maisVelha.getNome(), maisVelha.getIdade());

    }

}
