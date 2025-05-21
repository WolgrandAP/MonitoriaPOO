import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Exercicio {

    public static void main(String[] args) {
        String[] posicoes = {"Goleiro", "Defensor", "Meio-Campista", "Atacante"};
        String[] times = {"Flamengo", "São Paulo", "Palmeiras", "Santos", "Corinthians", "Grêmio", "Internacional", "Fluminense", "Atlético Mineiro", "Cruzeiro"};
        String[] nomes = {
                "Neymar", "Gabriel Barbosa", "Alisson", "Marquinhos", "Casemiro",
                "Roberto Firmino", "Thiago Silva", "Richarlison", "Lucas Paquetá", "Éder Militão",
                "Vinícius Júnior", "Fabinho", "Douglas Luiz", "Everton Ribeiro", "Ederson",
                "Gabriel Jesus", "Danilo", "Rodrygo", "Fred", "Reinier"
        };

        List<Jogador> jogadores = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Random r = new Random();
            String posicao = posicoes[r.nextInt(posicoes.length)];
            String time = times[r.nextInt(times.length)];
            String nome = nomes[r.nextInt(nomes.length)];
            int idade = r.nextInt(18, 40);
            int gols = r.nextInt(0, 30);
            jogadores.add(
                    new Jogador(nome, posicao, idade, time, gols));
        }

        // 1. Imprimir todos os jogadores
        imprimeTodos(jogadores);
        System.out.println();

        // 2. Imprimir jogadores de um determinado time
        filtraPorTime(jogadores, "Flamengo");
        System.out.println();

        // 3. Imprimir jogadores de um determinado time que tenham mais que um determinado número de gols marcados
        filtrarPorTimeEPorGol(jogadores, "Palmeiras", 10);
        System.out.println();

        // 4. Imprimir todos os jogadores, agrupando-os por time
        imprimeTodosPorTime(jogadores);
        System.out.println();

        // 5. Calcular média de idade dos jogadores
        mediaIdade(jogadores);
        System.out.println();

        // 6. Calcular média de idade dos jogadores de um time
        mediaIdadeTime(jogadores, "Santos");
        System.out.println();

        // 7. Imprimir jogador mais velho
        jogadorMaisVelho(jogadores);
        System.out.println();

        // 8. Imprimir jogador mais novo
        jogadorMaisNovo(jogadores);
        System.out.println();

        // 9. Imprimir jogador artilheiro
        jogadorArtilheiro(jogadores);
        System.out.println();

        // 10. Imprimir somatório de gols de todos os jogadores de um determinado time


    }

    public static void imprimeTodos(List<Jogador> jogadores) {
        jogadores.stream().forEach(System.out::println);
    }

    public static void filtraPorTime(List<Jogador> jogadores, String time) {
        jogadores.stream()
                .filter(j -> j.getTime().equals(time))
                .forEach(System.out::println);
    }

    public static void filtrarPorTimeEPorGol(List<Jogador> jogadores, String time, int gols) {
        jogadores.stream().filter(j -> j.getTime().equals(time) && j.getGolsMarcados() >= gols)
                 .forEach(System.out::println);
    }

    public static void imprimeTodosPorTime(List<Jogador> jogadores) {
        jogadores.stream()
                .collect(Collectors.groupingBy(Jogador::getTime))
                .forEach((time, listaJogadores) -> {
                    System.out.println("Time: " + time);
                    listaJogadores.forEach(j -> System.out.println("  - " + j.getNome()));
                });

        //O groupingBy cria um Map<String, List<Jogador>>, onde a chave é o nome do time e o valor é a lista de jogadores que pertencem a esse time.
    }

    public static void mediaIdade(List<Jogador> jogadores) {
        double media = jogadores.stream().mapToInt(j -> j.getIdade()).average().orElse(0);
        System.out.println("Média ded idade: " + media + " anos");
    }

    public static void mediaIdadeTime(List<Jogador> jogadores, String time) {
        double media = jogadores.stream().filter(j -> j.getTime().equals(time)).mapToInt(j -> j.getIdade()).average().orElse(0);
        System.out.printf("Média do time %s: %.2f%n", time, media);

    }

    public static void jogadorMaisVelho(List<Jogador> jogadores) {
        Optional<Jogador> idade = jogadores.stream().max(Comparator.comparingInt(Jogador::getIdade));
        Jogador j = idade.get();
        System.out.printf("O jogador mais velho é %s e tem %d anos.\n", j.getNome(), j.getIdade());
    }

    public static void jogadorMaisNovo(List<Jogador> jogadores) {
        Optional<Jogador> idade = jogadores.stream().min(Comparator.comparingInt(Jogador::getIdade));
        Jogador j = idade.get();
        System.out.printf("O jogador mais novo é %s e tem %d anos.\n", j.getNome(),j.getIdade());
    }

    public static void jogadorArtilheiro(List<Jogador> jogadores) {
        Optional<Jogador> gols = jogadores.stream().max(Comparator.comparingInt(Jogador::getGolsMarcados));
        Jogador j = gols.get();
        System.out.printf("O artilheiro foi %s com %d gols.\n", j.getNome(), j.getGolsMarcados());
    }

    public static void golsJogadoresDeUmTime(List<Jogador> jogadores, String time) {
        jogadores.stream().filter(j -> j.getTime().equals(time)).collect(Collectors.toList())
                .forEach(System.out::println("Time: " + time));
    }

}