package Shapes;

public class Rectangles extends Shapes {
    private int d;
    private int e;
    Rectangles(int d, int e) {
        name = "Rectangle";
        this.d = d;
        this.e = e;
    }


    public int getSquare() {
        return d * e;
    }

    public int getPerimeter() {
        return (d + e) * 2;
    }

}
