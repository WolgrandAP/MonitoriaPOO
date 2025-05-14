import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Maria", 8.5)); //Odouble é mais indicado para notas e dinheiro, não precisa colocar o f
        alunos.add(new Aluno("João", 7.2));
        alunos.add(new Aluno("Ana", 9.1));
        alunos.add(new Aluno("João", 9.0));
        alunos.add(new Aluno("Maria", 6.4));

        Comparator<Aluno> comparator = Comparator.comparing(Aluno::getNome).thenComparing(Aluno::getNota, Comparator.reverseOrder());

        alunos.sort(comparator);

        for (Aluno aluno : alunos) {
            System.out.println(aluno.toStrting());
        }

    }
}