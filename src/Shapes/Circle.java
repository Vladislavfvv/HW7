package Shapes;

public class Circle extends Rectangle {
    private int r;
    Circle(int r) {
        name = "Circle";
        this.r = r;
    }


    public void ShowName() {
        System.out.println("Это круг");
    }


    public int getSquare() {
        return (int) (PI * r * r);
    }


    public int getPerimeter() {
        return (int) (2 * PI * r);
    }
}
