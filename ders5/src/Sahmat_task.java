import java.math.BigInteger;

public class Sahmat_task {
    public static void main(String[] args) {
        BigInteger bugda = BigInteger.valueOf(1);
        for(int i = 1; i<=64;i++){
            bugda = bugda.multiply(BigInteger.valueOf(2));
        }
        System.out.println(" bugda denesinin sayi: " + bugda);
    }
}