package Shape;

abstract class Shapes {
    protected String name = "";
    protected double PI = 3.14;
    Shapes[] shapes = new Shapes[6];

    String getName(){
        return name;
    }

    public abstract int getSquare();


    public abstract int getPerimeter();
}
