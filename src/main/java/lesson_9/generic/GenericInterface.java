package lesson_9.generic;

public interface GenericInterface {

    interface Sender<T> {
        void send(T content);
    }

    class Money {}

    class Letter {}

    class Bank implements Sender<Money> {
        @Override
        public void send(Money content) {

        }
    }

    class Postman implements Sender<Letter> {
        @Override
        public void send(Letter content) {

        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.send(new Money());

        Postman postman = new Postman();
        postman.send(new Letter());
    }
}
