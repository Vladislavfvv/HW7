package Person;

public class Director implements  Interface{
    private String name;
    private boolean owner;

    public Director(String name, boolean b) {
        this.name = name;
        this.owner = b;
    }
    String getName(){
        return name;
    }

    @Override
    public void getPosition() {
        System.out.println("I'm a director");
    }
}
