package JavaFmYouTube;

public class Human {

    private int age;
    private int weight;
    private int height;
    private String name;
    private String male;

    public Human (int age, int weight, int height, String name, String male){
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.male = male;
    }

    public String isMale () {return male;}

    public int getAge () {return age;}
    public int getWeight() {return weight;}
    public int getHeight() {return height;}
    public String getName() {return name;}


}
