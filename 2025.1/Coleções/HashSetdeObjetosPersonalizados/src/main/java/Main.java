import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Produto> produtos = new HashSet<>();

        Produto p[] = new Produto[4];
        p[0] = new Produto(1,"Carne");
        p[1] = new Produto(2, "Queijo");
        p[2] = new Produto(3, "Manteiga");
        p[3] = new Produto(4, "Carne");

        produtos.add(p[0]);
        produtos.add(p[1]);
        produtos.add(p[2]);
        produtos.add(p[3]);

        for(Produto pro : produtos) {
            System.out.println("Produto: " + pro.getNome() + " ID(" + pro.getId() + ")");
        }

    }

}
