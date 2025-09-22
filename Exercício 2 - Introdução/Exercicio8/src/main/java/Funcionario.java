public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentoSalario(int percentual) {
        double fatorMultiplicador = (percentual/100.0) + 1;
        this.setSalario(getSalario() * fatorMultiplicador);
    }

    public String toString() {
        return String.format("Funcionário: %s - Cargo: %s - Salário: R$%.2f", getNome(), getCargo(), getSalario());
    }

}