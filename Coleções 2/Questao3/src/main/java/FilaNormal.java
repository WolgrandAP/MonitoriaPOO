import java.util.ArrayList;

public class FilaNormal {

    private int cont = 1;
    private ArrayList<Pessoa> fila = new ArrayList<>();

    public void adicionarFila(Pessoa pessoa) {
        fila.add(pessoa);
    }

    public void mostrarFila() {

        for (Pessoa pessoa : fila) {
            System.out.println(cont + " - " + pessoa.getNome() + " - " + pessoa.getIdade() + " anos");
            cont ++;
        }
    }

}
