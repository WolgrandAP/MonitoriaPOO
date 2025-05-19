public class Main {

    public static void main(String[] args) {

        FilaNormal fn = new FilaNormal();

        FilaPrioridade fp = new FilaPrioridade();

        Pessoa p[] = new Pessoa[4];

        p[0] = new Pessoa("André",19);
        p[1] = new Pessoa("Maria",28);
        p[2] = new Pessoa("João",54);
        p[3] = new Pessoa("Clara",25);

        fn.adicionarFila(p[0]);
        fn.adicionarFila(p[1]);
        fn.adicionarFila(p[2]);
        fn.adicionarFila(p[3]);

        System.out.println("*Fila normal");
        System.out.println("Ordem/Pessoa/Idade:");
        fn.mostrarFila();

        System.out.println();

        p[3].tornarPrioridade();
        p[1].tornarPrioridade();

        fp.adicionarFila(p[0]);
        fp.adicionarFila(p[1]);
        fp.adicionarFila(p[2]);
        fp.adicionarFila(p[3]);

        System.out.println("*Fila com prioridade(Quem tem o número 1 é prioridade)");
        System.out.println("Prioridade/Pessoa/Idade");
        fp.mostrarFila();

    }

}
