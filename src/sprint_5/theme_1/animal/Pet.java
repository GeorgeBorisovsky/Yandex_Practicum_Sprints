package sprint_5.theme_1.animal;

public abstract class Pet {
    private String voice;
    private int pawsCount;

    protected Pet(String voice) {
        this.voice = voice;
        pawsCount = 0;
    }

    void sleep() {
        System.out.println("Сплю");
    }

    void play() {
        System.out.println("Играю");
    }

    //public abstract String giveVoice();


    public void getVoice() {

    }

    public int getPawsCount() {
        return pawsCount;
    }
}
