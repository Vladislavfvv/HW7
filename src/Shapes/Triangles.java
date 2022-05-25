package Shapes;

public class Triangles extends Shapes {
    private int a;
    private int b;
    private int c;

    Triangles(int a, int b, int c) {
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
        int result = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;

    }


    public int getPerimeter() {

        return a + b + c;
    }


}
