package JavaFmYouTube;

public class Triangle implements Figure {

    double bokA;
    double bokB;
    double przekatna;

    public Triangle (double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.przekatna = Math.sqrt(Math.pow(bokA, 2) + Math.pow(bokB, 2));
     }

    @Override
    public double getObwod() {
        return bokA + bokB + przekatna;
    }

    @Override
    public double getPowierzchnia() {
        return 0.5 * bokA * bokB;
    }

    @Override
    public String getType() {
        return "triangle";
    }
}
