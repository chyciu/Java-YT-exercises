package JavaFmYouTube;

public class Add implements Computation {

    @Override
    public void compute(double agrument1, double argument2) {
        double sum = agrument1 + argument2;
        System.out.println("Wynik: "+ sum);
    }

    public static void main(String[] args) {
      Add add = new Add();
      add.compute(5, 8);
    }
}




