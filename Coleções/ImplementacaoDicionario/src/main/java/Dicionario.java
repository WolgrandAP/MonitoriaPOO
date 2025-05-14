import java.util.HashMap;

public class Dicionario {

    private HashMap<String, String> palavra = new HashMap();

    public void adicionarElemento(String word, String significado) {
        palavra.put(word, significado);
    }

    public String procurarPalavra(String word) {
        return "Significado da palavra '" + word + "': " +  palavra.get(word);
    }

}