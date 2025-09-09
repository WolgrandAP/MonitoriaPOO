import java.util.HashMap;

public class Cadastro {

    private HashMap<String, String> alunos = new HashMap<>();

    public boolean cadastroAluno(Aluno aluno) {
        if(alunos.containsKey(aluno.getCpf())) {
            return false;
        } else {
            alunos.put(aluno.getCpf(), aluno.getNome());
            return true;
        }
    }

    public boolean remocaoAluno(String cpf) {
        if (alunos.containsKey(cpf)) {
            alunos.remove(cpf);
            return true;
        } else {
            return false;
        }
    }

    public String consultaCPF(String cpf) {
        if (alunos.containsKey(cpf)) {
            return "CPF: " + cpf + " - Nome: " + alunos.get(cpf);
        } else {
            return "Aluno não encontrado.";
        }
    }

}
