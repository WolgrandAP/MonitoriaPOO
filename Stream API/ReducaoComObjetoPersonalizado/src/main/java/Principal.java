import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Livro> livros = Arrays.asList(
                new Livro("Alice no país das maravilhas", 30),
                new Livro("1984", 25),
                new Livro("Charlie Brown", 35)
        );

        int total = livros.stream().mapToInt(q -> q.getCopias()).sum();
        System.out.printf("O número total de livros é %d.", total);

    }

}