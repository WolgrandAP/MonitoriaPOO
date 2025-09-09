public class Main {

    public static void main(String[] args) {

        Contador cont = new Contador();

        String text = "Java é uma linguagem de programação. Java é poderosa, versátil e muito popular! Com Java, você pode criar aplicativos para web, desktop e mobile. Java, Java, Java!";

        cont.separarPalavras(text.toLowerCase().replaceAll("[.,!?;:]", ""));
        //O .replaceAll serve para eliminar pontuações do texto, a parte do regex é onde há os elementos alvos do texto que serão substituídos pelo replacement, que nesse caso é nada ou seja removendo-os.
        cont.contarLetras();
        System.out.println();
        System.out.println("Ordenado: ");
        cont.ordenarFrequencia();
        System.out.println();
        System.out.println("Top 10:");
        cont.top10();
    }
}
