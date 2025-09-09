import java.util.Arrays;
import java.util.HashMap;

public class Contador {

    private HashMap<String, Integer> contador = new HashMap<>();
    private String[] letras;

    public void separarPalavra(String word) {
        String[] letras = word.toLowerCase().split("");
        this.letras = letras;
        System.out.println("Array com as letras: " + Arrays.toString(letras));
    }

    public void contarLetras() {

        for (String letra : letras) {
            if(contador.containsKey(letra)) {
                contador.put(letra, contador.get(letra) + 1);
            } else {
                contador.put(letra, 1);
            }
        }

        for(String elemento : contador.keySet()) {
            System.out.println("A letra '" + elemento + "' aparece " + contador.get(elemento) + " vezes.");
        }
    }

}
