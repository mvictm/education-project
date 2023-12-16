package lesson_3.oop;

public class Encapsulation {

    public static void main(String[] args) {
        WrongClass wrongClass = new WrongClass();
        wrongClass.age = 10;
        wrongClass.name = "wrongName";
        wrongClass.isTrue = false;

        GoodClass goodClass = new GoodClass();
    }
}
