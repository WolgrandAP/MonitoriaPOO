public class Jogador {

    private String nome;
    private String posicao;
    private int idade;
    private String time;
    private int golsMarcados;

    public Jogador(String nome, String posicao, int idade, String time, int golsMarcados) {
        this.nome = nome;
        this.posicao = posicao;
        this.idade = idade;
        this.time = time;
        this.golsMarcados = golsMarcados;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }
    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", idade=" + idade +
                ", time='" + time + '\'' +
                ", golsMarcados=" + golsMarcados +
                '}';
    }

}
