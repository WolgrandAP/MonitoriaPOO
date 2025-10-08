package strategy;

public class AtaqueFisico implements EstrategiaDeAtaque {

    @Override
    public void atacar(String nome, String inimigo, int dano) {
        System.out.println(nome + " realizou um ataque físico de " + dano + " no oponente " + inimigo);
    }
}
