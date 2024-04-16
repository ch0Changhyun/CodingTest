package codeup;

import java.util.Scanner;

public class basic15 {
    public static void main(String[] args) {
        System.out.println("실수 둘째짜리 까지 출력");
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        System.out.printf("%.2f", x);
    }
}
