import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Dicionario dic = new Dicionario();

        dic.adicionarElemento("mãe", "Aquela que gerou, deu à luz e criou um ou mais filhos.");
        dic.adicionarElemento("falso","Contrário à verdade; sem correspondência com a realidade: nome falso.");
        dic.adicionarElemento("sol","Estrela ao redor da qual giram a Terra e outros planetas.");
        dic.adicionarElemento("carro","Qualquer veículo que se locomova sobre rodas; veículo, automóvel.");
        dic.adicionarElemento("cidade","Povoação de maior amplitude e importância.");

        System.out.print("Digite uma palavra: ");
        String palavra = tec.nextLine();

        System.out.println(dic.procurarPalavra(palavra.toLowerCase()));


    }

}
