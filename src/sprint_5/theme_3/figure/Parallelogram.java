package sprint_5.theme_3.figure;

public abstract class Parallelogram implements Figure {
    private double a;
    private double b;

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double getArea() {
        return a * b;
    }

    public void setWidth(double a) {
        this.a = a;
    }

    public void setHeight(double b) {
        this.b = b;
    }

    public double getWidth() {
        return a;
    }

    public double getHeight() {
        return b;
    }
}
