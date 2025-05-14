import java.util.*;

/*
HashSet não garante nenhuma ordem dos elementos. Ao adicionar itens, a ordem de exibição pode parecer aleatória, pois depende do código de hash de cada objeto.

LinkedHashSet mantém a ordem de inserção. Ou seja, os elementos aparecem na mesma ordem em que foram adicionados ao conjunto.

TreeSet ordena os elementos automaticamente de acordo com a ORDEM NATURAL (como ORDEM ALFABÉTICA para strings ou crescente para números) ou com um Comparator fornecido. A ordem de inserção não é considerada.
*/

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> listaLHM = new LinkedHashMap<>();

        listaLHM.put(1, "Oi");
        listaLHM.put(2, "Carro");
        listaLHM.put(3, "IF");
        listaLHM.put(4, "Estudo");

        HashSet<String> listaHS = new HashSet<>();

        listaHS.add("Oi");
        listaHS.add("Carro");
        listaHS.add("IF");
        listaHS.add("Estudo");

        TreeSet<String> listaTS = new TreeSet<>();

        listaTS.add("Oi");
        listaTS.add("Carro");
        listaTS.add("IF");
        listaTS.add("Estudo");

        System.out.println("LinkedHashMap: ");


        for (Map.Entry<Integer, String> entry : listaLHM.entrySet()) {
            System.out.print(entry.getKey() + " - " + entry.getValue() + "\n");
        }
        System.out.println();

        System.out.println("HashSet:");

        for (String item : listaHS) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("TreeSet:");

        for (String item : listaTS) {
            System.out.println(item);
        }

    }

}
