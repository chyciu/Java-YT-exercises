package JavaFmYouTube;

import java.util.Scanner;

public class Prostokat {

        private double lenght;
        private double wide;

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }


    public double poleProst () {
            double pole = lenght * wide;
            return pole;
        }

    public double obwodProst () {
        double obwod = 2 * lenght + 2 * wide;
        return obwod;
    }

    public double przekatnaProst () {
        double przekatna = Math.sqrt(Math.pow(lenght, 2) + Math.pow(wide, 2));
        return przekatna;
    }

}
