import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Maçã", "Banana", "Acerola", "Formiga", "Gato", "Arara");

        palavras.stream().map(p -> p.toUpperCase()).filter(p -> p.startsWith("A")).forEach(System.out::println);

    }

}
