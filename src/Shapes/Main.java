package Shapes;

import java.awt.geom.Area;

import static Shapes.LateBinding.GetArea;
import static Shapes.LateBinding.GetName;

public class Main {
    public static void main(String[] args) {
        /*Triangle triangle1 = new Triangle(1, 2, 3);
        Triangle triangle2 = new Triangle(3, 4, 5);
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(4, 5);
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);*/
        Shapes tr1 = new Triangles(1, 3, 5);
        Shapes tr2 = new Triangles(2, 4, 6);
        tr1.getName();
        tr2.getName();

        String name;
        name = GetName(tr1);
        System.out.println(name);

        int area;
        area = GetArea(tr1);
        System.out.println(area);

    }
}
