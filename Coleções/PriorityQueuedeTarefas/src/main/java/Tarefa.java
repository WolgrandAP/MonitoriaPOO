import java.util.Comparator;

public class Tarefa {

    private String nome;
    private int prioridade;
    private double tempoEstimado;

    public Tarefa(String nome, int prioridade, double tempoEstimado) {
        this.nome = nome;
        this.prioridade = prioridade;
        this.tempoEstimado = tempoEstimado;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public double getTempoEstimado() {
        return tempoEstimado;
    }
    public void setTempoEstimado(double tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public String toString() {
        return "Tarefa: " + this.getNome() + "/ Prioridade: " + this.getPrioridade() + "/ Tempo estimado: " + this.getTempoEstimado();
    }

}
