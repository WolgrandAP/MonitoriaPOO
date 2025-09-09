import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HistoricoNavegador pilhaInicial = new HistoricoNavegador();
        HistoricoNavegador pilhaFinal = new HistoricoNavegador();

        Scanner tec = new Scanner(System.in);
        int resp = 10;

        System.out.println("Qual será sua ação: \n1 - Visitar uma nova página \n2 - Voltar para a página anterior \n3 - Avançar para a próxima página \n0 - Sair");
        while (resp != 0) {
            System.out.print("Digite o número:");
            resp = tec.nextInt();
            tec.nextLine();

            switch (resp) {
                case(1) :
                    System.out.print("Digite a url da página: ");
                    String pag = tec.nextLine();
                    pilhaInicial.novaPagina(pag);
                    break;

                case(2) :
                    if (pilhaInicial.pilhacomElemento()) {
                        String pagAtual = pilhaInicial.retornarPagina();
                        pilhaInicial.removerPagina();
                        pilhaFinal.novaPagina(pagAtual);
                        System.out.println("Página: " + pilhaInicial.retornarPagina());
                    } else {
                        System.out.println("Não há mais páginas anteriores, vá para a próxima adiante.");
                    }
                    break;

                case(3):
                    if (pilhaFinal.pilhacomElemento()) {
                        String proxPag = pilhaFinal.retornarPagina();
                        pilhaFinal.removerPagina();
                        pilhaInicial.novaPagina(proxPag);
                        System.out.println("Página: " + pilhaInicial.retornarPagina());
                    } else {
                        System.out.println("Não há mais páginas adinate, volte a páina uma adicione uma nova.");
                    }
                    break;
            }

        }

    }

}
