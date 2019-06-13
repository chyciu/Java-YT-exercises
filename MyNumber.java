package JavaFmYouTube;

public class MyNumber {

    public double liczba;

    public void setLiczba(double liczba) {
        this.liczba = liczba;
    }

    public MyNumber() {
        this.liczba = liczba;
    }

    public boolean isOdd () {
        double odd = liczba % 2;
        if (odd == 0) {return false;}
        else return true;
    }

    public boolean isEven () {
        double even = liczba % 2;
        if (even == 0) {return true;}
        else return false;
    }

    public double sqrt () {
        double sqrtMy = Math.sqrt(liczba);
        return sqrtMy;
    }

    public double power () {
        double pow = Math.pow(liczba, 2);
        return pow;
        }


    }





