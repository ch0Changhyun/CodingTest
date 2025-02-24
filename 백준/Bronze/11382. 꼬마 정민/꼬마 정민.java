import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        BigInteger C = scanner.nextBigInteger();
        
        BigInteger result = A.add(B).add(C);
        
        System.out.println(result);
        
        scanner.close();
    }
}