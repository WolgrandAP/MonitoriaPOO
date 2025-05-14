public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        p.adicionarTelefone("João",22224444);
        p.adicionarTelefone("Maria",33613723);
        p.adicionarTelefone("Clara", 40404440);

        String a = p.pesquisarContato("Clara");
        System.out.println(a);

        p.removerTelefone("Maria");
        String c = p.pesquisarContato("Maria");
        System.out.println(c);

    }
}
