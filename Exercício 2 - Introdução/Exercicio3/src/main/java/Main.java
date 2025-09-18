public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João",25,"Rua das Flores, 521 - Curitiba/PR");
        Pessoa p2 = new Pessoa("Maria",16,"Avenida Paulista, 134 - São Paulo/SP");
        Pessoa p3 = new Pessoa("Ana",40,"Rua XV de Novembro, 782 - Porto Alegre/RS");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}