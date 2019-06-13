package JavaFmYouTube;

import java.util.Scanner;

public class PartFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz trzy liczby od 1 do 100\n");

        int a, b, c;

        System.out.println("Pierwsza liczba to: ");
        a = scanner.nextInt();
        System.out.println("Drugs liczba to: ");
        b = scanner.nextInt();
        System.out.println("Trzecia liczba to: ");
        c = scanner.nextInt();

        if ((a > b) && (a > c) && (b > c))
            System.out.println("\nKolejność to: " + c + " " + b + " "+ a);

        else if ((b > a) && (b > c) && (a > c))
            System.out.println("\nKolejność to: " + c + " " + a + " " +b);

        else if ((c > a)  && (c > b) && (a > b))
           System.out.println("\nKolejność to: " + b + " " + a + " " + c);

        else if ((a > c) && (c > b) && (a > b))
            System.out.println("\nKolejność to: " + b + " " + c + " " + a);


    }
}
