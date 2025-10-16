package Questao1;

import model.Pessoa;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GerenciadorFila arrayList = new GerenciadorFila(new ArrayList<>());

        GerenciadorFila linkedList = new GerenciadorFila(new LinkedList<>());

        // Teste com o ArrayList
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.adicionarPessoaNaFila(new Pessoa("Model.Pessoa " + i, String.valueOf(i), 20));
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo para adicionar - ArrayList: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.removerPrimeiraPessoa();
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo para remover - ArrayList: " + (fim - inicio) + " ms");

        System.out.println("------------------------------------------------------");

        // Teste com o LinkedList
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.adicionarPessoaNaFila(new Pessoa("Model.Pessoa " + i, String.valueOf(i), 20));
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo para adicionar - LinkedList: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.removerPrimeiraPessoa();
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo para remover - LinkedList: " + (fim - inicio) + " ms");

        /*
        O ArrayList é baseado em um array(vetor). Quando se vai adicionar elementos do final é rápido, pois só insere no fim do vetor.
        Mas para remover é lento pois todos os elementos precisam ser deslocados uma posição para a esquerda para preencher o espaço vazio.

        O LinkedList é uma lista encadeada, onde cada elemento(nó) guarda referências para anterior e o próximo.
        Adicionar no final e remover do início são operações rápidas pois basta ajustar os ponteiros entre os nós, sem mover dados da memória.
         */
    }
}
