package Shapes;

// �����, ������� ���������� ����������� �����
public class LateBinding {
    // �����, ������� �������� ������ �� ������� �����
    static String GetName(Shapes f) {
        return f.getName();}// ����� ������ �������� ������
        // �����, ������� ���������� ������� ������, f - ������ �� ������� �����
        // ������������ ������� ����������,
        // ����� ��� ���������� ������� ������������ �� ������ �������� ������ f
        static int GetArea(Shapes f){
            return f.getSquare();// ����� ������ ���������� �������
    }

    static int GetPerimeter(Shapes f){
        return f.getPerimeter();
    }

    void connect() {

    }
}
