public class Conta {

    private double saldo;
    private double limite;

    public Conta() {}

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

   public void deposita(double valor) {
        this.setSaldo(this.getSaldo() + valor);
   }

   public void saca(double valor) {
        this.setSaldo(this.getSaldo() - valor);
   }

   public String mostarSaldo() {
        return "Saldo: R$" + this.getSaldo();
   }

}