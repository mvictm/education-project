package lesson_10.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {

    static int first = 10;

    public static void main(String[] args) {
        executePrint();
        executeLocalVariable();
        lambdaWithGeneric();
        standardFuncInterface();
    }

    private static void executePrint() {
        Printable printable;

        printable = () -> System.out.println("Печатаем");
        //printable = (text, size) -> System.out.println(text + " размером = " + size);

        printable.print();
        //printable.print("Печатаем через аргуемент с размером", 10);
    }

    private static void executeLocalVariable() {
        int second = 100;

        Calculate calculate = () -> {
            first = 40;
            //second = 50;
            System.out.println("Исходные значения first=" + first + " second=" + second);
            return first + second;
        };

        calculate.execute();
        System.out.println(first);
    }

    private static void lambdaWithGeneric() {
        Operation<String> stringOperation = (first, second) -> first + second;
        Operation<Integer> integerOperation = (first, second) -> first + second;

        stringOperation.execute("Конкатенация ", "строк");
        integerOperation.execute(432, 956);
    }

    private static void standardFuncInterface() {
        Predicate<Integer> integerPredicate = number -> number > 0;
        integerPredicate.test(100);
        integerPredicate.test(-100);

        Consumer<String> stringConsumer = string -> System.out.println(string);
        stringConsumer.accept("Тест для печати");

        Supplier<String> stringSupplier = () -> "константа для supplier";
        stringSupplier.get();

        Function<String, Integer> function = string -> Integer.valueOf(string);
        function.apply("10");
    }
}
