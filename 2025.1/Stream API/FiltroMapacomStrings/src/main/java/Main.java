import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("gato", "cachorro", "elefante","ave" ,"leão");

        palavras.stream().filter(p -> p.length()>3).map(p -> p.toUpperCase()).forEach(System.out::println);

    }

}
