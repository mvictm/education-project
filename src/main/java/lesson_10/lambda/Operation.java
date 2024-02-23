package lesson_10.lambda;

public interface Operation<T> {
    T execute (T first, T second);
}
