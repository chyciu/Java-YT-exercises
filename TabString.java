package JavaFmYouTube;

public class TabString {

    public void alfabet () {

        String alfa[] = {"a", "b", "c", "d", "e"};
        for (int i = 0; i < alfa.length; i++) {
            System.out.print(alfa[i]);
        }
    }

    public void tabLiczb () {

        int tabLiczby [] = new int[] {1,2,3};

        for (int i = 2; i < tabLiczby.length; i--)
        {
            System.out.println("elemnty" + tabLiczby[i]);
        }
    }

    public void dodatnia () {

        int liczba = 4;
        int x = 0;

        while (x <= liczba)
            System.out.print(x++);
        }

    public void odrwacanie () {

        String input = "jarek";

        char blacha [] = input.toCharArray();
        for (int i = blacha.length-1; i>=0;  i--)
        System.out.print(blacha[i]);

     }

     public  void palindrom () {

         String slowo = "was is a cat i saw";
         char palid [] = slowo.toCharArray();

         int begin, midd, end;
         begin = 0;
         end = palid.length-1;
         midd = (begin+end)/2;

         for (int i = begin; i <= midd ; i++) {
             if (slowo.charAt(begin) == slowo.charAt(end)) {
                 begin++;
                 end--;
         } else break;
       }
         if (begin == midd+1) {
             System.out.println("Palidrom");
         } else
             System.out.println("Not palidrom");
     }



}

