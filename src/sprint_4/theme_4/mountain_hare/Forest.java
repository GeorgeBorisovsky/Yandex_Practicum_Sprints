package sprint_4.theme_4.mountain_hare;

import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;
    // объявите недостающие переменные и добавьте конструктор
    private static String season;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }


    public static String getSeason() {
        return season;
    }
    // добавьте метод setSeason(String newSeason)
       void setSeason(String newSeason) {
        Forest.season = newSeason;
        if (newSeason.equals("зима")) {
            MountainHare.color = "белый";
        } else {
            MountainHare.color = "серо-рыжий";
        }
    }




    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    // добавьте метод printHares()
    void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }

    }

}
