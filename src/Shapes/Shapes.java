package Shapes;

abstract class Shapes {
    protected String name = "";
    protected double PI = 3.14;


    String getName(){
        return name;
    }

    public abstract int getSquare();


    public abstract int getPerimeter();
}
