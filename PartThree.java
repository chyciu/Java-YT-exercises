package JavaFmYouTube;

public class PartThree {

    public static void main(String[] args) {

     int tablica [][] = new int[][] {
             {1111},
             {111},
             {1111111}
     };

        for (int i = 0; i <tablica.length ; i++) {
            for (int j = 0; j <tablica[i].length ; j++) {
                System.out.println(tablica[i][j]);
            }
        }

        char alfa = 'a';
        char zet = 'z';

        while (alfa <= zet) {
            System.out.print(alfa++);
        }

        System.out.println();

        int array [] = new int[10];
        array [0] = 11;
        array [1] = 22;
        array [2] = 33;
        array [3] = 44;
        array [4] = 55;
        array [5] = 66;
        array [6] = 77;
        array [7] = 88;
        array [8] = 99;
        array [9] = 110;
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }


    }
}
