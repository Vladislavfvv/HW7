package Shapes;

public class Triangle extends Shapes {
    private int a;
    private int b;
    private int c;

    Triangle(int a, int b, int c) {
        name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
    }

   public void ShowName() {
        System.out.println("Это треугольник");
    }


    public int getSquare() {
        int p = (a + b + c) / 2;
        return (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }


    public int getPerimeter() {

        return a + b + c;
    }


}
