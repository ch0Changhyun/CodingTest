package codeup;

import java.util.Scanner;

public class basic20 {
    public static void main(String[] args) {
        System.out.println("주민번호 형태 바꾸기");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] arr = s.split("\\-");
        System.out.printf("%s%s", arr[0], arr[1]);
    }
}
