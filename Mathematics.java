package JavaFmYouTube;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Mathematics {

    public void dzialania() {

        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz dowolne dwie liczby całkowite\n");
        System.out.println("Pierwsza liczba to: ");
        int a = input.nextInt();

        System.out.println("Druga liczba to: ");
        int b = input.nextInt();

        int suma = a + b;
        int roznica = a - b;
        int iloczyn = a * b;
        System.out.println("Wyniki to: \n" +
                "suma: " + suma + "\n"
                + "różnic: " + roznica + "\n"
                + "iloczyn: " + iloczyn);
    }

    public void parzysta() {

        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz dowolnę liczby całkowitą\n");
        System.out.println("Wybrana liczba to: ");
        int c = input.nextInt();

        int d = c % 2;

        if (d == 0) {
            System.out.println("Licza jest parzysta");
        } else
            System.out.println("Liczba jest nieparzysta");

    }

    public boolean przezTrzy() {

        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz dowolnę liczby całkowitą\n");
        System.out.println("Wybrana liczba to: ");
        int g = input.nextInt();

        int h = g % 3;
        int k = g % 5;

        if (h == 0 && k == 0) {
            System.out.println("Licza jest podzielna przez 3 oraz przez 5");
        } else
            System.out.println("Liczba nie jest podzielna przez 3 i 5");

        return true;

    }

    public void power3() {

        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz dowolnę liczby całkowitą\n");
        System.out.println("Wybrana liczba to: ");
        double g = input.nextInt();

        double wynik = Math.pow(g, 3);
        System.out.println("Wynik podniesienia liczby do potegi drugiej to: "+ wynik);

        double wynik2 = Math.cbrt(g);
        System.out.println("Pierwiastek trzeciego stopia z wybranej liczby to: "+ wynik2);

    }

    public void trojkat () {

        Scanner input = new Scanner (System.in);

        System.out.println("Podaj długosci trzech boków trójkąta");
        System.out.println("Wpisz liczby całkowite\n");

        System.out.println("Pierwszy bok to: ");
        int bokA = input.nextInt();

        System.out.println("Drugi bok to: ");
        int bokB = input.nextInt();

        System.out.println("Trzeci bok to: ");
        int bokC = input.nextInt();

        double poleA = bokA * bokA;
        double poleB = bokA * bokB;
        double poleC = bokC * bokC;

        if (poleA + poleB ==  poleC || poleA + poleC == poleB || poleB + poleC == poleA) {
            System.out.println("Z podanych boków można zbudować trójkąt prostokątny");
        } else
            System.out.println("Z podanych boków nie zbudujesz trójkąta prostokątnego");
    }

}
