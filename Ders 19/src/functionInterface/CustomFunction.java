package functionInterface;

@FunctionalInterface
public interface CustomFunction<T,R> {
    R accept(T t);

}
