public class Exercicio2 {

    public static void main(String[] args) {

        Integer num1 = 128;
        Integer num2 = 128;
        System.out.println(num1 == num2);

        //Quando você faz Integer num1 = 128;, o Java aplica autoboxing, ou seja, transforma o valor primitivo
        // int em um objeto Integer através de Integer.valueOf(128)

        //A classe Integer mantém um cache interno para os valores entre -128 e 127 (por padrão da JVM).
        //Dentro dessa faixa, chamadas repetidas a Integer.valueOf(x) retornam a mesma instância.
        //Fora dessa faixa, um novo objeto é criado para cada chamada.

        //Para valores até 127, wrappers de Integer podem ser a mesma instância e == pode dar true.
        //Para valores maiores que 127, cada variável recebe um novo objeto, e == retorna false.

    }
}
