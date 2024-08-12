package sprint_5.theme_1.animal;

public class Cat extends Pet{

    public Cat() {
        super("мяу");
    }

    void catchMouse() {
        System.out.println("Поймала мышку!");
    }

    public void giveVoice() {
        System.out.println("мяу");
    }

}
