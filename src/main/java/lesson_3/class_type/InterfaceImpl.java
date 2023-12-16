package lesson_3.class_type;

public class InterfaceImpl implements InterfaceExample {
    @Override
    public void method() {
        System.out.println("Переопределенный метод");
    }

    public static void main(String[] args) {
        InterfaceExample example = new InterfaceImpl();

        example.method();
        example.defaultMethod();
    }
}
