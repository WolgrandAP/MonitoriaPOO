public class Principal {

    public static void main(String[] args) {

        Conta minhaConta = new Conta();
        System.out.println(minhaConta.mostarSaldo());
        minhaConta.deposita(100);
        minhaConta.setLimite(100);
        minhaConta.saca(1000);
        System.out.println(minhaConta.mostarSaldo());

    }

}
