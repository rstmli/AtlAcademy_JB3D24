package functionInterface;

@FunctionalInterface
public interface CustomPredicate<T> {
    boolean test(T a);

}
