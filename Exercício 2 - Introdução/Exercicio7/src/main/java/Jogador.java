public class Jogador {

    private String nome;
    private int nivel;
    private int pontos;

    public Jogador(String nome) {
        this.nome = nome;
        this.nivel = 0;
        this.pontos = 0;
    }

    public Jogador(String nome, int nivel, int pontos) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontos = pontos;
    }

    public void subirNivel() {
        this.nivel += 1;
    }

    public void ganharPontos(int pontos) {
        this.pontos += pontos;
    }

    @Override
    public String toString() {
        return "Jogador = '" +
                nome +
                "' , nivel = " + nivel +
                ", pontos = " + pontos;
    }
}