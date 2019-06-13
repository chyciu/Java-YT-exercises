package JavaFmYouTube;

public class PilotTV {

    private int volume [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    private int channels [] = {1,2,3,4,5,6,7,8,9};
    private boolean onOFF;
    private int ch;


    public void setOnOFF(boolean onOFF) {
        this.onOFF = onOFF;
        if (onOFF)
            System.out.println("TV jest włączony");
    }

    public void setChannels (int ch) {
        for (int i = 0; i <  channels.length; i++) {
            System.out.println("Aktualny kanał to "+ ch);
        }

    }


}
