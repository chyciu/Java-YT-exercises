package JavaFmYouTube;

import java.util.Scanner;

public class Java4Zad5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text;
        int liczba;

        System.out.println("Wpisz dowolny tekst");
        text = scanner.nextLine();

        System.out.println("Teraz wpisz dowolną liczbę całkowitą");
        liczba = scanner.nextInt();

        System.out.println("Czy mamy wydrukować Twój tekst?\n");
        System.out.println("Wpisz 1 co oznacza TAK lub 2 co oznacza NIE");


        Scanner input = new Scanner(System.in);
        String print = input.nextLine();
        int ilosc = liczba;

        switch (print) {

            case "1":
                for (int i = 0; i < ilosc; i++) {
                    System.out.println(text);
                }
                break;
            case "2":
                System.out.println("OK, to nie drukujemy");
                break;
            default:
                System.out.println("Ups, chyba coś żle wybrałeś");

        }
    }
}
