package JavaFmYouTube;

import java.util.Scanner;

public class InterfejsMain {

    public static void main(String[] args) {

        Figure figure [] = new Figure[3];

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj promień koła");
        figure[0] = new Circle(input.nextDouble());

        System.out.println("Podaj dwa boki trójkata");
        figure[1] = new Triangle(input.nextDouble(), input.nextDouble());

        System.out.println("Podaj dwa boki prostokąta");
        figure[2] = new Rectangle(input.nextDouble(), input.nextDouble());

        for (Figure figure1 : figure) {
            System.out.println(figure1.getType());
            System.out.println("Pole: " + figure1.getPowierzchnia());
            System.out.println("Obwód: "+ figure1.getObwod());
        }
    }
}
