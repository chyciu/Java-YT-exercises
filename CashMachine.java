package JavaFmYouTube;

import java.util.Scanner;

public class CashMachine {

    String cardNumber;
    CardDebet cardDebet = new CardDebet();

    int choice = 0;
    Scanner scanner = new Scanner(System.in);

    public void startBankomat() {

        System.out.println("Witamy w bankomacie!\nWłóż kartę");
        cardNumber = scanner.next();
        if (!cardDebet.checkCard(cardNumber))
            System.out.println("Nie rozpoznano karty. Koniec programu.");
        else {
            while (choice != 3) {
                System.out.println(
                        "Wybierz operacje: " + "\n" +
                                "Aby sprawdzic stan konta wybierz [1]" + "\n" +
                                "Aby wyplacic pieniadze wybierz [2]" + "\n" +
                                "Aby zakonczyc wybierz [3]"
                );
                choice = operation(scanner.nextInt());
            }
        }

    }

    private void paycheck(int pay) {

        if (pay <= cardDebet.getAccountBallance((cardNumber))) {
            cardDebet.updatedAccountBalance(cardNumber, pay);
        } else
            System.out.println("Zbyt mało środkow na koncie");
    }

    private int operation(int a) {
        switch (a) {
            case 1:
                System.out.println("Masz " + cardDebet.getAccountBallance(cardNumber) + " na koncie." + "\n");
                break;
            case 2:
                System.out.println("Ile chcesz wyplacic?");
                paycheck(scanner.nextInt());
                break;
            case 3:
                System.out.println("Koniec programu.");
                break;
            default:
                System.out.println("Nie rozpoznano polecenia." + "\n");
        }
        return a;
    }
}


