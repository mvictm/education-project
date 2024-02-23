package lesson_10.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Лондон", "Париж", "Москва");

        List<String> stringList = List.of("Лондон", "Париж", "Москва");
        Stream<String> stream = stringList.stream();
    }
}
