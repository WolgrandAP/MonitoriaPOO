import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Contador {

    private HashMap<String, Integer> frequencia = new HashMap<>();
    private String[] palavras;

    public String separarPalavras(String text) {
        palavras = text.split(" ");
        return "Array com as palavras separadas: " + Arrays.toString(palavras);
    }

    public void contarLetras() {

        for (String palavra : palavras) {
            if (frequencia.containsKey(palavra)) {
                frequencia.put(palavra, frequencia.get(palavra) + 1);
            } else {
                frequencia.put(palavra, 1);
            }
        }

        //keySet() é um método da classe HashMap que retorna um conjunto (Set) com todas as chaves (keys) presentes no mapa. Neste caso, essas chaves são as palavras que foram contadas.
        for (String palavra : frequencia.keySet()) {
            System.out.println("Palavra: " + palavra + " - Frequência: " + frequencia.get(palavra));
        }
    }

    public void ordenarFrequencia() {

        frequencia.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEach(entry -> System.out.println("Palavra: " + entry.getKey() + " - Frequência: " + entry.getValue()));
    }

    public void top10() {

        frequencia.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(10).forEach(entry -> System.out.println("Palavra: " + entry.getKey() + " - Frequência: " + entry.getValue()));
    }

}
