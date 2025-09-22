public class Triangulo {

    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String tipoTriangulo() {
        if (lado1 == lado2 && lado2==lado3) {
            return "Triângulo equilátero";
        } else if (lado1 == lado2 && lado2 != lado3 || lado2==lado3 && lado3 != lado1 || lado1==lado3 && lado2!=lado3) {
            return "Triângulo isósceles";
        } else {
            return "Triângulo escaleno";
        }
    }

    public String trianguloIsValido() {
        if (lado1>0 && lado2>0 && lado3>0) {
            if (lado1 + lado2 > lado3 || lado2 + lado3 > lado1 || lado3 + lado1 > lado2) {
                return "Triângulo válido";
            } else {
                return "Triângulo inválido";
            }
        } else {
            return "Triângulo inválido";
        }
    }

}