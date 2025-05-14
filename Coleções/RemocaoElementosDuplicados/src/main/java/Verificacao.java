import java.util.ArrayList;
import java.util.List;

public class Verificacao {

    private List<String> lista = new ArrayList<>();
    private List<String> listaOrganizada = new ArrayList<>();

    public void adicionarElemento(String elemento) {
        lista.add(elemento.toLowerCase());
    }

    public void organizarLista() {
        for(String elemento : lista) {
            if (!listaOrganizada.contains(elemento)) {
                listaOrganizada.add(elemento);
            }

        }
    }

    public String mostrarLista() {
        return "Lista inicial: " + lista;

    }

    public String mostrarListaOrganizada() {
        return "Lista sem os elementos duplicados: " + listaOrganizada;
    }


}
