package codeup;

import java.util.Scanner;

public class basic61To70 {
    public static void main(String[] args) {
//        61
//        System.out.println("비트단위로 OR 하여 출력하기");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(a | b);

//        62
//        System.out.println("비트단위로 OR 하여 출력하기");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(a ^ b);

//        63
//        System.out.println("두 정수 입력받아 큰 수 출력하기 : ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(a > b ? a : b);
//        System.out.println(Math.max(a, b));

//        64
//        System.out.println("정수 3개 입력받아 가장 작은 수 출력하기 : ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        System.out.println((a < b ? a : b) < c ? (a < b ? a : b) : c);
//        System.out.println(Math.min((Math.min(a, b)), c));

//        65
//        System.out.println("정수 3개 입력받아 짝수만 출력하기 : ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        if (a % 2 == 0)
//            System.out.println(a);
//        if (b % 2 == 0)
//            System.out.println(b);
//        if (c % 2 == 0)
//            System.out.println(c);

//        66
//        System.out.println("정수 3개 입력받아 짝/홀 출력하기 : ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        if (a % 2 == 0)
//            System.out.println("even");
//        else
//            System.out.println("odd");
//
//        if (b % 2 == 0)
//            System.out.println("even");
//        else
//            System.out.println("odd");
//
//        if (c % 2 == 0)
//            System.out.println("even");
//        else
//            System.out.println("odd");

//        67
//        System.out.println("정수 1개 입력받아 분석하기 : ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        if (a < 0) {
//            System.out.println("minus");
//            if (a % 2 == 0)
//                System.out.println("even");
//            else
//                System.out.println("odd");
//        } else {
//            System.out.println("plus");
//            if (a % 2 == 0)
//                System.out.println("even");
//            else
//                System.out.println("odd");
//        }

//        68
//        System.out.println("정수 1개 입력받아 평가 출력하기 : ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        if (a >= 90 && a <= 100)
//            System.out.println("A");
//        else if (a >= 70 && a<= 89)
//            System.out.println("B");
//        else if (a >= 40 && a<= 69)
//            System.out.println("C");
//        else
//            System.out.println("D");

//        69
//        System.out.println("평가 입력받아 다르게 출력하기 : ");
//        Scanner scanner = new Scanner(System.in);
//        char data = scanner.nextLine().charAt(0);
//        switch(data) {
//            case 'A' :
//                System.out.println("best!!!");
//                break;
//            case 'B' :
//                System.out.println("good!!");
//                break;
//            case 'C' :
//                System.out.println("run!");
//                break;
//            case 'D' :
//                System.out.println("slowly~");
//                break;
//            default :
//                System.out.println("what?");
//                break;
//        }

//        70
        System.out.println("월 입력받아 계절 출력하기 : ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch(month) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("winter");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("spring");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("summer");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("fall");
                break;
        }
    }
}
