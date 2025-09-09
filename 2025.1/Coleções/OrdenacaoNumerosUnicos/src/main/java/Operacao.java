import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Operacao {

    private List<Integer> listaNumeros = new ArrayList<>();

    public void adicionarElemento(int num) {
        listaNumeros.add(num);
    }

    public String mostrarLista() {
        return "Lista com elementos repetidos: " + listaNumeros;
    }

    public String mostrarListaOrganizada() {
        List<Integer> listaSemRepetidos = new ArrayList<>();

        for (int numero : listaNumeros) {
            if (!listaSemRepetidos.contains(numero)) {
                listaSemRepetidos.add(numero);
            }
        }

        return "Lista sem os elementos repetidos: " + listaSemRepetidos;
    }
}
