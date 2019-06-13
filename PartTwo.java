package JavaFmYouTube;

public class PartTwo {

    public static void main(String[] args) {

        int z1 = 15;
        int z2 = 5;
        int wynik1, wynik2, wynik3, wynik4, wynik5;

        wynik1= z1+z2;
        wynik2 = z1-z2;
        wynik3 = z1*z2;
        wynik4 = z1/z2;
        wynik5 = z1%z2;

        System.out.println("Wynik = " +wynik1);
        System.out.println("Wynik = " +wynik2);
        System.out.println("Wynik = " +wynik3);
        System.out.println("Wynik = " +wynik4);
        System.out.println("Wynik = " +wynik5);

        char letter = 'a';
        letter++;
        System.out.println("Wynik: " + letter+letter+letter);

        double zmienna = 10.123456789;
        zmienna++;
        zmienna++;
        zmienna++;
        zmienna++;
        zmienna++;
        zmienna++;
        zmienna++;
        zmienna++;
        zmienna++;
        zmienna++;
        System.out.println("Wynik: " + zmienna);

        String add = "Wynikiem dodawania liczby 2 i 2 jest ";
        int add2 = 2;
        add2++;
        add2++;

        System.out.println(add + add2);

        int promien = 47;
        double ObKola = 2 * Math.PI * promien;
        double PoleKola = Math.PI * Math.pow(promien, 2);
        System.out.println("Obwód koła = " + ObKola);
        System.out.println("Pole koła = " + PoleKola);


    }

}
