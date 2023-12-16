package lesson_3.class_type;

public interface InterfaceExample {
    void method();
    default void defaultMethod() {
        System.out.println("Реализация по умолчанию");
    }
}
