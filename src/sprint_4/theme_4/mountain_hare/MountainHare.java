package sprint_4.theme_4.mountain_hare;

import java.util.Objects;

public class MountainHare {
     int age;
     double weight;
     int jumpLength;
     static String color;

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;

    }


// добавьте переменные и конструктор





    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MountainHare that = (MountainHare) object;
        return age == that.age && Double.compare(weight, that.weight) == 0 && jumpLength == that.jumpLength;
    }


}
