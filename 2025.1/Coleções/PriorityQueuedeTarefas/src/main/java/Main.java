import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<Tarefa> fila = new PriorityQueue<>(Comparator.comparing(Tarefa::getPrioridade));

        fila.add(new Tarefa("Lavar o carro", 3, 2.5));
        fila.add(new Tarefa("Fazer almoço",2,2));
        fila.add(new Tarefa("Tomar remédio", 1, 0.5));


        while (!fila.isEmpty()) {
            System.out.println("Executando: " + fila.poll());
        }

        for(Tarefa elemento : fila) {
            System.out.println(elemento); //Demonstrar que está vazia
        }

    }

}