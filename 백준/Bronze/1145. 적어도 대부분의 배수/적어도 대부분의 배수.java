import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int result = findMinMultiple(numbers);
        System.out.println(result);
    }

    public static int findMinMultiple(int[] numbers) {
        int minLCM = Integer.MAX_VALUE;
        
        // 모든 세 수의 조합에 대해 최소 공배수를 계산
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    int lcm = lcm(numbers[i], numbers[j], numbers[k]);
                    if (lcm < minLCM) {
                        minLCM = lcm;
                    }
                }
            }
        }
        
        return minLCM;
    }

    // 세 수의 최소 공배수를 계산하는 함수
    public static int lcm(int a, int b, int c) {
        return lcm(a, lcm(b, c));
    }

    // 두 수의 최소 공배수를 계산하는 함수
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // 두 수의 최대 공약수를 계산하는 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
