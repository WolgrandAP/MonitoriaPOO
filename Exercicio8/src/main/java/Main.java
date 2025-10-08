import strategy.AtaqueFisico;

public class Main {

    public static void main(String[] args) {

        Personagem p1 = new Personagem("He-man");
        Personagem p2 = new Personagem("Esqueleto");

        p1.setEstrategia(new AtaqueFisico());
        p1.atacar(p2, 30);

        p2.atacar(p1, 25);
    }
}
