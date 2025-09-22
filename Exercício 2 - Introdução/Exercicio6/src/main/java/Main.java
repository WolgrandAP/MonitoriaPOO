public class Main {
    public static void main(String[] args) {

        // Equilátero: todos os lados iguais
        Triangulo t1 = new Triangulo(5, 5, 5);
        System.out.println("t1: " + t1.trianguloIsValido() + " - " + t1.tipoTriangulo());

        // Isósceles: dois lados iguais
        Triangulo t2 = new Triangulo(6, 6, 4);
        System.out.println("t2: " + t2.trianguloIsValido() + " - " + t2.tipoTriangulo());

        // Escaleno: todos os lados diferentes
        Triangulo t3 = new Triangulo(7, 5, 6);
        System.out.println("t3: " + t3.trianguloIsValido() + " - " + t3.tipoTriangulo());

        // Inválido: soma de dois lados não é maior que o terceiro
        Triangulo t4 = new Triangulo(2, 2, 5);
        System.out.println("t4: " + t4.trianguloIsValido() + " - " + t4.tipoTriangulo());
    }
}
