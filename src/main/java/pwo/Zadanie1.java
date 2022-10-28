package pwo;

public class Zadanie1 {

    public static final int FROM = 0, TO = 100;
    public static final String FILE_NAME_FIBONACCI = "fibseq100.txt";
    public static final String FILE_NAME_LUCAS = "lucas100.txt";

    public static void main(String[] args) {

        System.out.println("Fibonacci wersja 2");

        boolean ok = SequenceTools.writeToFile(
                new FibonacciGenerator(), FROM, TO, FILE_NAME_FIBONACCI);

        if (ok) {
            System.out.println("Wynik fibonacci zapisany do pliku: "
                    + FILE_NAME_FIBONACCI);
        } else {
            System.out.println("Błąd");
        }
        
        System.out.println("Lucas");

        ok = SequenceTools.writeToFile(
                new LucasGenerator(), FROM, TO, FILE_NAME_LUCAS);

        if (ok) {
            System.out.println("Wynik lucas zapisany do pliku: "
                    + FILE_NAME_LUCAS);
        } else {
            System.out.println("Błąd");
        }
    }
}
