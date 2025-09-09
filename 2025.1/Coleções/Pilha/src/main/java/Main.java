import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.adicionarElemento(1);
        pilha.adicionarElemento(10);
        pilha.adicionarElemento(80);
        pilha.adicionarElemento(5);
        pilha.adicionarElemento(800);

        pilha.mostrarLista();

        pilha.removerElemento();

        pilha.mostrarLista();

    }

}
