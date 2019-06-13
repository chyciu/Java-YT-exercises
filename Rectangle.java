package JavaFmYouTube;

public class Rectangle implements Figure {

    double a;
    double b;

    public Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPowierzchnia() {
        return a * b;
    }

    @Override
    public double getObwod() {
        return 2 * (a+b);
    }

    @Override
    public String getType() {
        return "rectangle";
    }
}
