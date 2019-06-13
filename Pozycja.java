package JavaFmYouTube;

public class Pozycja {

    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
      }

    public double obliczWartosc () {
        double wartoscPozZamow = ileSztuk * cena;
        return wartoscPozZamow;
    }

    public void lista () {
        System.out.println(String.format(nazwaTowaru + "  " + cena + " zł  " + ileSztuk + " szt.  " + obliczWartosc()+ " zł"));
    }

    @Override
    public String toString () {
        return String.format(nazwaTowaru + "  " + cena + " zł  " + ileSztuk + " szt.  " + obliczWartosc()+ " zł");
    }
}
