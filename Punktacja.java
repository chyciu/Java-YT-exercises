package JavaFmYouTube;

import java.util.Scanner;

public class Punktacja {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Witamy w programie do obliczania punktów\n");

        int styl, efekty, rezultat;

        System.out.println("Wpisz punkty za styl:");
        styl = scanner.nextInt();
        System.out.println("Wpisz punkty za efekty:");
        efekty = scanner.nextInt();
        System.out.println("Wpisz punkty za rezultat:");
        rezultat = scanner.nextInt();

        double stylFinal = styl * 0.2;
        double efektyFinal = efekty * 0.3;
        double rezulatFinal = rezultat * 0.5;

        double suma = stylFinal+efektyFinal+rezulatFinal;

        System.out.println("\nKońcowa punktacja to: " + suma);
    }
}
