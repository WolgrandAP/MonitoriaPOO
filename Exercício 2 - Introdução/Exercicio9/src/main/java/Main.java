public class Main {
    public static void main(String[] args) {
        // Casos de teste válidos
        try {
            Estudante e1 = new Estudante(1, "Ana Silva", 2000, 5, 15);
            System.out.println("Criado com sucesso: " + e1);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro ao criar estudante válido (e1): " + e.getMessage());
        }

        try {
            Estudante e2 = new Estudante(2, "Carlos Souza", 1998, 12, 30);
            System.out.println("Criado com sucesso: " + e2);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro ao criar estudante válido (e2): " + e.getMessage());
        }

        // Casos de teste inválidos
        try {
            Estudante e3 = new Estudante(3, "Pedro Santos", 2026, 3, 10);
            System.out.println(e3);
        } catch (ValorInvalidoException e) {
            System.out.println("Teste inválido (ano > 2025): " + e.getMessage());
        }

        try {
            Estudante e4 = new Estudante(4, "Maria Oliveira", 2002, 13, 10);
            System.out.println(e4);
        } catch (ValorInvalidoException e) {
            System.out.println("Teste inválido (mês > 12): " + e.getMessage());
        }

        try {
            Estudante e5 = new Estudante(5, "João Lima", 1999, 7, 0);
            System.out.println(e5);
        } catch (ValorInvalidoException e) {
            System.out.println("Teste inválido (dia < 1): " + e.getMessage());
        }

        try {
            Estudante e6 = new Estudante(6, "Fernanda Costa", 2001, 4, 35);
            System.out.println(e6);
        } catch (ValorInvalidoException e) {
            System.out.println("Teste inválido (dia > 30): " + e.getMessage());
        }
    }
}
