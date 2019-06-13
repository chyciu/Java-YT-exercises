package JavaFmYouTube;

public class ZadaniaDwa {

    public static void main(String[] args) {

        Prostokat prostokat = new Prostokat();
        MyNumber myNumber = new MyNumber();

        prostokat.setLenght(5);
        prostokat.setWide(7);

        System.out.println("Obwód: " + prostokat.obwodProst());
        System.out.println("Pole: " + prostokat.poleProst());
        System.out.println("Przekątna: "+ prostokat.przekatnaProst()+ "\n");

        myNumber.setLiczba(7);

        System.out.println("czy nieparzysta: " + myNumber.isOdd());
        System.out.println("czy parzysta: "+ myNumber.isEven());
        System.out.println("Pierwiastek kw: " + myNumber.sqrt());


    }
}
