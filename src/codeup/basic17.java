package codeup;

import java.util.Scanner;

public class basic17 {
    public static void main(String[] args) {
        System.out.println("정수 1개 3번 출력");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.printf("%d %d %d", i, i, i);
    }
}
