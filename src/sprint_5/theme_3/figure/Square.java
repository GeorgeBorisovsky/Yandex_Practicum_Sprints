package sprint_5.theme_3.figure;

public class Square extends Rectangle {
    private double a;

    public Square(double a) {
        super(a, a);
    }

    @Override
    public double getArea() {
        return a * a;
    }

    public void setSize(double a) {
        this.a = a;
    }

    public double getSize() {
        return a;
    }
}
