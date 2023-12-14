package lesson_3.conflict;

public class ConflictClass {
    private static int number = 154;

    public static void main(String[] args) {
        int count = 15;

        System.out.println("Обновленный некий текст");
        System.out.println(count * number);
        System.out.println("Текст после с обновлением");
    }
}
