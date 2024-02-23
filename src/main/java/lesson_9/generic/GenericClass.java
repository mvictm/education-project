package lesson_9.generic;

public class GenericClass {

    static class Account<T> {
        public Account(T id) {
            this.id = id;
        }

        public T getId() {
            return id;
        }

        private T id;
    }

    public static void main(String[] args) {
        Account<String> stringAccount = new Account<>("123");

        Account<Integer> integerAccount = new Account<>(345);

        //Account<Double> doubleAccount = new Account<>("123");
    }
}
