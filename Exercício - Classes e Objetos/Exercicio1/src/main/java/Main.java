public class Main {

    public static void main(String[] args) {

        Estudante e1 = new Estudante("João", 1212, 12.60, 100, 80, 20);
        Estudante e2 = new Estudante("Maria", 2929, 80, 50.60, 90, 100);

        System.out.printf("Condição do aluno %s: %s\n", e1.getNome(), e1.isAprovado());
        System.out.printf("Condição do aluno %s: %s\n", e2.getNome(), e2.isAprovado());

        System.out.printf("Média de %s: %.2f\n", e1.getNome(), e1.getMedia());
        System.out.printf("Média de %s: %.2f\n", e2.getNome(), e2.getMedia());

        System.out.printf("Segunda nota do aluno %s: %.2f", e1.getNome(), e1.getNota(1));

    }
}
