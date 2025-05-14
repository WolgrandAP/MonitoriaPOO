import java.util.LinkedHashMap;

public class Pessoa {

    private String nome;
    private int telefone;
    private LinkedHashMap<String, Integer> listaTelefonica = new LinkedHashMap();

    public Pessoa() {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return telefone;
    }
    public void setNumero(int telefone) {
        this.telefone = telefone;
    }

    public void adicionarTelefone(String nome, Integer numero) {
        listaTelefonica.put(nome, numero);
    }

    public void removerTelefone(String nome) {
        listaTelefonica.remove(nome);
    }

    public String pesquisarContato(String nome) {
        if(listaTelefonica.containsKey(nome)) {
            return "Nome: " + nome + "/ Telefone: " + listaTelefonica.get(nome);
        } else {
            return "Registro não existe!";
        }
    }

}
