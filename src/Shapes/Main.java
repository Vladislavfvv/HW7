package Shapes;

import java.awt.geom.Area;

import static Shapes.LateBinding.GetArea;
import static Shapes.LateBinding.GetName;

public class Main {
    public static void main(String[] args) {
        Shapes triangle1 = new Triangles(1, 2, 3);
        Shapes triangle2 = new Triangles(3, 4, 5);
        Shapes rectangle1 = new Rectangles(2, 3);
        Shapes rectangle2 = new Rectangles(4, 5);
        Shapes circle1 = new Circles(3);
        Shapes circle2 = new Circles(4);
        Shapes[] sh = new Shapes[6];
        sh[0] = triangle1;
        sh[1] = triangle2;
        sh[2] = rectangle1;
        sh[3] = rectangle2;
        sh[4] = circle1;
        sh[5] = circle2;

        int summ = 0;
        for (int i = 0; i < sh.length; i++) {
            summ += sh[i].getPerimeter();
        }
        System.out.println(summ);

        /*Shapes tr1 = new Triangles(1, 3, 5);
        Shapes tr2 = new Triangles(2, 4, 6);
        tr1.getName();
        tr2.getName();
        int s = triangle1.getSquare();
        String name;
        name = GetName(tr1);
        System.out.println(name);

        int area;
        area = GetArea(tr2);
        System.out.println(area);
        System.out.println(s);

        int s2 = triangle2.getSquare();
        System.out.println(s2);
        int p1 = rectangle1.getSquare();
        System.out.println(p1);
        int p3 = rectangle1.getPerimeter();
        System.out.println(p3);*/


    }
}
