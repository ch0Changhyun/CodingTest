import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A > 0 && B > 0 && A < 10 && B < 10) {
            System.out.println((double) A / B);
        }
    }
}
