package codeup;

import java.util.Scanner;

public class basic19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next();
        String[] arr = w.split("\\.");
        System.out.println("연월일 .으로 구분");
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        int C = Integer.parseInt(arr[2]);
        System.out.printf("%04d.%02d.%02d", A, B, C);
    }
}
