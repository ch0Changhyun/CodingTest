import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A >= 2 && B >= 2 && C >= 2 && A <= 10000 && B <= 10000 && C <= 10000) {
            System.out.println((A + B) % C);
            System.out.println(((A % C) + (B % C)) % C);
            System.out.println((A * B) % C);
            System.out.println(((A % C) * (B % C)) % C);
        }
    }
}
