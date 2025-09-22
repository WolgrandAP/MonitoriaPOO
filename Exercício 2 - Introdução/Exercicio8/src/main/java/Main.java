public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe Funcionario
        Funcionario f1 = new Funcionario("Ana Silva", "Desenvolvedora", 5000.0);
        Funcionario f2 = new Funcionario("Carlos Pereira", "Gerente", 8000.0);

        // Exibindo informações antes do aumento
        System.out.println("Antes do aumento:");
        System.out.println(f1);
        System.out.println(f2);

        // Dando aumento de 10% para Ana e 20% para Carlos
        f1.aumentoSalario(10);
        f2.aumentoSalario(20);

        // Exibindo informações depois do aumento
        System.out.println("\nDepois do aumento:");
        System.out.println(f1);
        System.out.println(f2);
    }
}
