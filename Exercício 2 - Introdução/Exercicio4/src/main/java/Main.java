public class Main {

    public static void main(String[] args) {

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 39.90);
        Livro l2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 89.90);
        Livro l3 = new Livro("1984", "George Orwell", 45.50);

        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
    }
}