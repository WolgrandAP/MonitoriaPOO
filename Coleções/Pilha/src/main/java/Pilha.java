import java.util.ArrayList;
import java.util.Arrays;

public class Pilha {
    //LIFO
    private ArrayList<Integer> lista = new ArrayList<>();
    private int topo = -1;

    /*public Pilha() {
        lista = new ArrayList<>();    //Inicializa a lista, pode ser iniciado tanto no atributo quanto no construtor
    }*/

    public void adicionarElemento(int num) {
        lista.add(num);
        topo++;
    }

    public void removerElemento() {
        if(topo>=0) {
            lista.remove(topo);
            topo--;
        }
    }

    public void mostrarLista() {
        System.out.println(lista); //Arrays.toString não é necessário para ArrayList, ele já imprime num formato legível
    }

}
