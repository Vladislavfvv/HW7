package Person;

public class Accountant implements Interface{
    private String name;

    public Accountant(String name) {
        this.name = name;
    }

    @Override
    public void getPosition() {
        System.out.println("accountant");
    }

    public String getName() {
        return name;
    }
}
