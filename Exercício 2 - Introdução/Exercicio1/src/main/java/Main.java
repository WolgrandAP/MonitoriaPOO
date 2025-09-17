public class Main {

    public static void main(String[] args) throws NotaInvalidaException {

        Estudante e1 = new Estudante("João", 100, 60,80,40);
        Estudante e2 = new Estudante("Maria", 101, 80, 80, 100);

        System.out.println("Notas do aluno: " + e1.getNome());
        System.out.printf("Nota 1: %.1f, Nota 2: %.1f, Nota 3: %.1f\n", e1.getNota1(), e1.getNota2(), e1.getNota3());
        System.out.printf("Média: %.2f\n", e1.getMedia());
        System.out.println(e1.isAprovado());

        System.out.println();

        System.out.println("Notas do aluno: " + e2.getNome());
        System.out.printf("Nota 1: %.1f, Nota 2: %.1f, Nota 3: %.1f\n", e2.getNota1(), e2.getNota2(), e2.getNota3());
        System.out.printf("Média: %.2f\n", e2.getMedia());
        System.out.println(e2.isAprovado());

    }
}