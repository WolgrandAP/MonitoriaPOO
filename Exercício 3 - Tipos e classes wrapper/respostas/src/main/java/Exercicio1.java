public class Exercicio1 {

    public static void main(String[] args) {
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 200;
        Integer num4 = 200;
        System.out.println(num1 == num2); // (1)
        System.out.println(num3 == num4); // (2)
        System.out.println(num1.equals(num2)); // (3)

        //O '==' compara primitvos e referências, verifica se o conteùdo possui o mesmo endereçamento de memória.
        // .equals() serve para comparar o conteùdo/valor de objetos, verifica o conteúdo passado como parâmetro.
    }
}
