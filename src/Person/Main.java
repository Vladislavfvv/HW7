package Person;

public class Main {
    public static void main(String[] args) {
        Director dir = new Director("Big Boss", true);
        Worker w = new Worker("Vasa");
        Accountant a = new Accountant("Foxy-Masha");

        dir.getPosition();
        System.out.println(dir.getName());
        System.out.println("///////////////");
        w.getPosition();
        System.out.println("My name is: " + w.getName());
        System.out.println("///////////////");
        a.info();
        a.getPosition();
        System.out.println("My name is: " + a.getName());
        System.out.println("///////////////");
        Interface inter = new Accountant("sasa");
        inter.info();
        Interface.infoPosition();
        System.out.println(((Accountant)inter).getClass().getName());


    }
}
