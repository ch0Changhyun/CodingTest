import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int n1 = num2 % 10;
        int n2 = (num2 / 10) % 10;
        int n3 = num2 / 100; 

        int result1 = num1 * n1;
        int result2 = num1 * n2;
        int result3 = num1 * n3;

        int finalResult = num1 * num2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(finalResult);
    }
}
