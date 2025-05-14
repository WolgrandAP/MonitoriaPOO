import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Operacao op = new Operacao();
        op.adicionarElemento(1);
        op.adicionarElemento(10);
        op.adicionarElemento(20);
        op.adicionarElemento(5);
        op.adicionarElemento(5);
        op.adicionarElemento(8);
        op.adicionarElemento(90);
        op.adicionarElemento(1);
        op.adicionarElemento(1);
        op.adicionarElemento(1);

        System.out.println(op.mostrarLista());

        System.out.println(op.mostrarListaOrganizada());

    }
}
