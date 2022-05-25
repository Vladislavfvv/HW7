package Shape;

public class Main {
    public static void main(String[] args) {
        /*Triangle triangle1 = new Triangle(1, 2, 3);
        Triangle triangle2 = new Triangle(3, 4, 5);
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(4, 5);
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);*/
        Shapes tr1 = new Triangle(1, 3, 5);
        Shapes tr2 = new Triangle(2, 4, 6);
        tr1.getName();
        tr2.getName();
    }
}
