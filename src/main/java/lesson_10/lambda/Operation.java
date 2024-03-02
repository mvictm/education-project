package lesson_10.lambda;

public interface Operation<T, R> {
    R execute(T first, T second);
}
