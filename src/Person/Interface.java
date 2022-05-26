package Person;

public interface Interface {

    void getPosition();

    default void info(){
        System.out.println("Вы работаете на должности:");
    }
    static void infoPosition(){
        System.out.println("Вас зовут:");
    }
}
