import java.util.HashSet;

public class Produto {

    private int id;
    private String nome;

    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;
        return nome.equals(produto.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode(); // String é uma classe, e você está tentando chamar hashCode() como se fosse um método estático — mas hashCode() é um método de instância, ou seja, você deve chamar a partir de um objeto String, como nome.
    }

}
