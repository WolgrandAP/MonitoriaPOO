public class Estudante {

    private String nome;
    private int matricula;
    private double n1, n2, n3;

    public Estudante(String nome, int matricula, double n1, double n2, double n3) throws NotaInvalidaException {
        this.nome = nome;
        this.matricula = matricula;
        this.setNotas(n1, n2, n3);
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return n1;
    }

    public double getNota2() {
        return n2;
    }

    public double getNota3() {
        return n3;
    }

    public double getMedia() {
        return (n1 + n2 + n3)/3;
    }

    public void setNotas(double n1, double n2, double n3) throws NotaInvalidaException {
        if (n1<0 || n2<0 || n3<0) {
            throw new NotaInvalidaException("Não é permitido nota negativa");
        }

        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String isAprovado() {
        if (this.getMedia()>=70) {
            return "Aluno aprovado";
        } else {
            return "Aluno reprovado";
        }
    }

}