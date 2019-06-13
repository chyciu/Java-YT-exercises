package JavaFmYouTube;

import java.io.IOException;

public class ZamowienieMain {

    public static void main(String[] args) throws IOException {

        Zamowienie zamowienie = new Zamowienie(7);

        Pozycja pozycja1 = new Pozycja("Chleb", 20, 5);
        Pozycja pozycja2 = new Pozycja("Masło", 10, 2);
        Pozycja pozycja3 = new Pozycja("Woda", 60, 3);

        zamowienie.dodajPozycje(pozycja1);
        zamowienie.dodajPozycje(pozycja2);
        zamowienie.dodajPozycje(pozycja3);
        System.out.println("Lista zamówień: \n");
        pozycja1.lista();
        pozycja2.lista();
        pozycja3.lista();

    }
}
