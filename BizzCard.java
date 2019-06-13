package JavaFmYouTube;

import java.util.Scanner;

public class BizzCard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Welcome!!! Here we prepare your bizz card\n");

        System.out.println("Please wrote your name");
        String name;
        name = scanner.next();

        System.out.println("Please wrote your surname");
        String surname;
        surname = scanner.next();

        System.out.println("Please wrote your phone number");
        int phone;
        phone = scanner.nextInt();

        System.out.println("\nYour bizz card look that:\n");

        System.out.println("-------------------------------");
        System.out.println("*****   " + name + "   *****   ");
        System.out.println("*****   " + surname + "   *****   ");
        System.out.println(" Pnone number: " + phone);
        System.out.println("-------------------------------");

    }
}
