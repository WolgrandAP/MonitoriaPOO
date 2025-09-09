import java.util.ArrayList;
import java.util.List;

public class Verificacao {

    private List<Character> lista = new ArrayList<>();
    

    public boolean verificacaoP(String word) {

        for (char letra: word.toCharArray()) {
            lista.add(letra);
        }

        int i = 0;
        int f = lista.size() - 1; //Retorna o número dos elementos de uma lista, e como eu usarei o índice para uma lista, subtrtaísse -1;

        while (i<=f) {
            if (!lista.get(i).equals(lista.get(f))) {
                return false;
            }

            i++;
            f--;
        }

        return true;

    }

}
