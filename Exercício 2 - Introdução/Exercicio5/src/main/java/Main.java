public class Main {

    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente(2222,"João", 2500);
        ContaCorrente c2 = new ContaCorrente(1234,"Maria" ,800.5);
        ContaCorrente c3 = new ContaCorrente(6666,"Ana" ,0);

        c1.deposito(1000);

        c2.saque(50.5);

        c3.deposito(10000);

        System.out.println(c1.exibirSaldo());
        System.out.println(c2.exibirSaldo());
        System.out.println(c3.exibirSaldo());
    }
}