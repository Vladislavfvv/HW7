package Shape;

public class Circles extends Shapes {
    private int r;
    Circles(int r) {
        name = "Circle";
        this.r = r;
    }



    public void ShowName() {

        System.out.println();
        System.out.println("Это круг");
    }


    public int getSquare() {
        return (int) (PI * r * r);
    }


    public int getPerimeter() {
        return (int) (2 * PI * r);
    }
}
