public class ContaCorrente {

    private int numeroDaConta;
    private double saldo;
    private String titularDaConta;

    public ContaCorrente(int numeroDaConta, String titularDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitularDaConta() {
        return titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public void deposito(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void saque(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }

    public String exibirSaldo() {
        return String.format("Saldo da conta %d: %.2f", numeroDaConta, saldo);
    }
}