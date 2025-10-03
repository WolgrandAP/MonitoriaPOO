public class Estudante {

    private String nome;
    private int matricula;
    private double[] nota;

    public Estudante(String nome, int matricula, double... notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public double getMedia() {
        double media = 0;
        int cont = 0;

        for (int i = 0; i <= nota.length-1; i++) {
            media += nota[i];
            cont++;
        }

        return media/cont;
    }

    public void setNotas(double... notas) {
        this.nota = nota;
    }

    public double getNota(int indice) {
        return nota[indice];
    }

    public String isAprovado() {
        if (this.getMedia()>=70) {
            return "Aluno aprovado";
        } else {
            return "Aluno reprovado";
        }
    }
}