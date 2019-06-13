package JavaFmYouTube;

import java.util.Scanner;

public class WiekOrazImię {

    public void wiek () {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj swój rok urodzenia");
        int yearOfBirth = input.nextInt();

        System.out.println("Podaj obecny rok");
        int currentYear = input.nextInt();

        int age = currentYear - yearOfBirth;
        System.out.println("Twój wiek to " + age + " lat.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imię");
        String imie = scanner.next();

        System.out.println("Podaj swoje nazwisko");
        String nazwisko = scanner.next();

        System.out.println("\nTwoje imię i nazwisko to "+ imie + " " + nazwisko);
        System.out.println("I masz " + age + " lat!!!");

    }
}
