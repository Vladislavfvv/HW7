package Person;

public interface Interface {

    void getPosition();

    default void info(){
        System.out.println("�� ��������� �� ���������:");
    }
    static void infoPosition(){
        System.out.println("��� �����:");
    }
}
