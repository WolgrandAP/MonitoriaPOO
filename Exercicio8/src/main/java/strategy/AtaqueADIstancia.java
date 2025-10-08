package strategy;

public class AtaqueADIstancia implements EstrategiaDeAtaque {

    @Override
    public void atacar(String nome, String inimigo, int dano) {
        System.out.println(nome + " realizou um ataque a distância de " + dano + " no oponente " + inimigo);
    }
}
