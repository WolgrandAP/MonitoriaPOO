import strategy.EstrategiaDeAtaque;

public class Personagem {
    private String nome;
    private EstrategiaDeAtaque estrategia;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEstrategia(EstrategiaDeAtaque estrategia) {
        this.estrategia = estrategia;
    }

    public void atacar(Personagem inimigo, int dano) {
        if (estrategia==null) {
            System.out.println("Não houve estratégia de ataque definida");
        } else {
            estrategia.atacar(this.getNome(), inimigo.getNome(), dano);
        }
    }

}