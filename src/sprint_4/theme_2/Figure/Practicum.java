package sprint_4.theme_2.Figure;

public class Practicum {
    public static void main(String[] args) {
        Figure figure = new Figure();
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Ellipse ellipse = new Ellipse();


        circle.drawCircle();
        square.drawSquare();
        rectangle.drawRectangle();
        ellipse.drawCircle();
        ellipse.circleToEllipse();

    }
}


class Figure {
}

class Circle extends Figure {
    public void drawCircle() {
        System.out.println("Рисуем круг");
    }

}

class Square extends Figure {
    public void drawSquare() {
        System.out.println("Рисуем квадрат");
    }
}

class Rectangle extends Figure {
    public void drawRectangle() {
        System.out.println("Рисуем прямоугольник");
    }
}

class Ellipse extends Circle {
    public void circleToEllipse() {
        System.out.println("Превращаем круг в овал");
    }
}