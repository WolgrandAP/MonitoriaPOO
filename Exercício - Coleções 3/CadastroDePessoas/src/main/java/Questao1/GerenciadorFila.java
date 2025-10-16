package Questao1;

import model.Pessoa;
import java.util.List;

public class GerenciadorFila {
    private List<Pessoa> lista;
    private Pessoa pessoa;

    public GerenciadorFila(List<Pessoa> lista) {
        this.lista = lista;
    }

    public void adicionarPessoaNaFila(Pessoa p) {
        for (int i = 0; i <= lista.size()-1; i++) {
            if (p.equals(lista.get(i))) {
                return;
            }
        }
        lista.add(p);
    }

    public void removerPrimeiraPessoa() {
        if (lista.size() != 0) {
            lista.remove(0);
        }
    }

}
