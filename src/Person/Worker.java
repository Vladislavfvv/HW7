package Person;

public class Worker implements  Interface{
private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void getPosition() {
        System.out.println("I'm a worker");
    }

    public String getName() {
        return name;
    }
}
