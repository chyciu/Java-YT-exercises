package JavaFmYouTube;

public class Multi implements Computation {

    @Override
    public void compute(double agrument1, double argument2) {
        double multi = agrument1 * argument2;
        System.out.println("Wynk mnożenia to: " + multi);
    }

    public static void main(String[] args) {
        Multi multi = new Multi();
        multi.compute(6, 2);
    }
}
