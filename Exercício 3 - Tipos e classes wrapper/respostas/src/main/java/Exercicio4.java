import java.util.Scanner;

public class Exercicio4 {

    public static void coverter(Double valor) {
        int valorInt = valor.intValue();
        long valorLong = valor.longValue();
        float valorFloat = valor.floatValue();
        byte valorByte = valor.byteValue();

        System.out.println("Valor original (Double): " + valor);
        System.out.println("Valor em int: " + valorInt);
        //Pode haver perda da parte decimal e, se for muito grande, overflow.
        System.out.println("Valor em long: " + valorLong);
        //Perde a parte decimal, mas comporta números maiores que int.
        System.out.println("Valor em float: " + valorFloat);
        //Mantém casas decimais, mas com menos precisão que Double, float-> 32 bits e o double-> 64 bits.
        System.out.println("Valor em byte: " + valorByte);
        //Perde parte decimal e também pode ocorrer overflow (limite: -128 a 127).
    }

    public static void main(String[] args) {
        Double numero = 12345.6789;
        coverter(numero);
    }
}