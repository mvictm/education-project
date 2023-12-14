package lesson_3.conflict;

public class ConflictClass {
    private static int number = 10;

    public static void main(String[] args) {
        int count = 15;

        System.out.println("Некий текст");
        System.out.println(count * number);
        System.out.println("Текст после");
    }
}
