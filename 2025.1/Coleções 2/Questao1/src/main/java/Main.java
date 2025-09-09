public class Main {

    public static void main(String[] args) {

        Cadastro c = new Cadastro();
        Aluno a1 = new Aluno("12345678901", "João");
        Aluno a2 = new Aluno("23456789012", "Maria");

        System.out.println(c.cadastroAluno(a1));
        System.out.println(c.cadastroAluno(a1)); //Retorna false pois já existe um aluno coom esse mesmo cpf

        System.out.println(c.consultaCPF("12345678901"));

        System.out.println(c.cadastroAluno(a2)); //Aqui se adiciona o aluno
        System.out.println(c.consultaCPF("23456789012")); //Sserá retornado os dados do aluno a2 referente ao cpf

        System.out.println(c.remocaoAluno("23456789012")); //Porém como ele é removido dedpois, a próxima saída terá "Aluno não encontrado"
        System.out.println(c.consultaCPF("23456789012"));

    }

}
