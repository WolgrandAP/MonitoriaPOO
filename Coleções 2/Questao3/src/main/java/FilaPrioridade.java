import java.util.HashMap;
import java.util.Map;

public class FilaPrioridade {

    private HashMap<Pessoa, Integer> fila = new HashMap<>();

    public void adicionarFila(Pessoa pessoa) {
        if(pessoa.isPrioridade()) {
            fila.put(pessoa, 1);
        } else {
            fila.put(pessoa, 2);
        }


    }

    public void mostrarFila() {

        fila.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> {Pessoa pessoa = entry.getKey();
            System.out.println(entry.getValue() + " - " + pessoa.getNome() + " - " + pessoa.getIdade() + " anos");});

    }

}
