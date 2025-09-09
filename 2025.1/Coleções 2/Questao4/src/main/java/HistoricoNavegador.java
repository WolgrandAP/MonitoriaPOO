import java.util.Stack;

public class HistoricoNavegador {

    private Stack<String> pilha = new Stack<>();

    public void novaPagina(String url) {
        pilha.push(url);
    }

    public void removerPagina() {
        pilha.pop();
    }

    public String retornarPagina() {
        return pilha.peek();
    }

    public boolean pilhacomElemento() {
        return !pilha.isEmpty();
    }

}
