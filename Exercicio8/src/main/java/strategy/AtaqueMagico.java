package strategy;

public class AtaqueMagico implements EstrategiaDeAtaque {

    @Override
    public void atacar(String nome, String inimigo, int dano) {
        System.out.println(nome + " realizou um ataque mágico de " + dano + " no oponente " + inimigo);
    }
}
