package JavaFmYouTube;

public class Circle implements Figure {

    double promien;


    public Circle(double promien) {
        this.promien = promien;
    }

    @Override
    public double getPowierzchnia() {
        return Math.PI * Math.pow(promien, 2);
      }

    @Override
    public double getObwod() {
        return 2 * Math.PI * promien;
    }

    @Override
    public String getType() {
        return "circle";
    }
}

