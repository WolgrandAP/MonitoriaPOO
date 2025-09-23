import java.time.LocalDate;

public class Estudante {

    private int matricula;
    private String nome;
    private int dia, mes, ano;

    public Estudante(int matricula, String nome, int ano, int mes, int dia) throws ValorInvalidoException {
        this.matricula = matricula;
        this.nome = nome;
        if (ano > 2025) {
            throw new ValorInvalidoException("Ano informado inválido");
        } else {
            this.ano = ano;
        }

        if (mes<1 || mes>12) {
            throw new ValorInvalidoException("Mês informado inválido");
        } else {
            this.mes = mes;
        }

        if (dia<1 || dia>30) {
            throw new ValorInvalidoException("Dia informado inválido");
        } else {
            this.dia = dia;
        }

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getIdade() {
        return  2025 - this.getAno();
    }

    public String toString() {
        return String.format("Estudante: %s - Matrícula: %d - Idade: %d", this.getNome(), this.getMatricula(), this.getIdade());
    }

}