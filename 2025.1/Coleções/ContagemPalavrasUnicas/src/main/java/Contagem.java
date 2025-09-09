import java.util.Arrays;
import java.util.HashMap;

public class Contagem {

    private HashMap<String, Integer> lista = new HashMap<>(); //A palavra deve ser a chave pois é imutável e na contagem só se considera um único valor, já o valor será o número de vezes que ele aparece pois é mutável e pode se repetir com as demais contagens

    public void contar(String text) {

        String[] listaPalavras = text.split(" ");

        System.out.println(Arrays.toString(listaPalavras));

        for (String palavra : listaPalavras) {
            if (lista.containsKey(palavra)) {
                lista.put(palavra, lista.get(palavra) + 1);
            } else {
                lista.put(palavra, 1);
            }
        }

        System.out.println("Contagem final:");
        for (String palavra : lista.keySet()) { //O lista.keySet() retorna todas as palavras (chaves) do HashMap
            System.out.println(palavra + ": " + lista.get(palavra));
        }

        //O método .get(palavra) serve para retornar o valor associado à chave "palavra" dentro do HashMap.
    }
}

