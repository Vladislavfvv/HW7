package Shape;

public class Rectangle extends Shapes {
    private int d;
    private int e;
    Rectangle(int d, int e) {
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
