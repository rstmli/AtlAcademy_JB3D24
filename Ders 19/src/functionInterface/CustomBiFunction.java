package functionInterface;

@FunctionalInterface
public interface CustomBiFunction <T, U, R>{
    R apply(T t, U u);
}
