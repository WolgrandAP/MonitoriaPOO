import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int cont = 0;

        Verificacao ver = new Verificacao();

        while (cont == 0) {

            System.out.print("Digite uma palavra: ");
            String word = ent.nextLine();
            if(word.toLowerCase().equals("sair")) {
                cont ++;
            } else {
                ver.adicionarElemento(word);
            }

        }

        System.out.println(ver.mostrarLista());

        ver.organizarLista();

        System.out.println(ver.mostrarListaOrganizada());

    }

}
