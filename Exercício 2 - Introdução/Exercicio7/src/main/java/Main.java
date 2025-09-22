public class Main {
    public static void main(String[] args) {

        // Criando jogador com apenas o nome (nível e pontos começam em 0)
        Jogador j1 = new Jogador("Alice");
        System.out.println(j1);

        // Criando jogador já com nível e pontos definidos
        Jogador j2 = new Jogador("Bob", 3, 150);
        System.out.println(j2);

        // Alice ganha pontos e sobe de nível
        j1.ganharPontos(50);
        j1.subirNivel();
        System.out.println("Depois de evoluir -> " + j1);

        // Bob ganha mais pontos e sobe dois níveis
        j2.ganharPontos(200);
        j2.subirNivel();
        j2.subirNivel();
        System.out.println("Depois de evoluir -> " + j2);
    }
}
