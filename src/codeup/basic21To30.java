package codeup;

import java.util.Scanner;

public class basic21To30 {
    public static void main(String[] args) {
//        21
//        System.out.println("1개의 단어 입력 받아 그대로 출력하기");
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
//        System.out.println(s);

//        22
//        System.out.println("공백 문자가 포함되어 있는 문장을 그대로 입력 받아 그대로 출력");
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        System.out.println(s);

//        23
//        System.out.println("실수 1개 입력 받아 정수와 실수 나누기 출력");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        String[] list = str.split("[.]");
//        String[] list = str.split("\\.");
//        System.out.println(list[0]);
//        System.out.println(list[1]);

//        24
//        System.out.println("단어 1개 입력 받아 각 문자를 한줄에 한 문자씩 분리해 출력");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        String[] list = str.split("");
//        for (String s : list) System.out.println("'" + s + "'");
//        for (int i = 0 ; i < list.length; i++)
//            System.out.println("'"+list[i]+"'");

//        25
//        System.out.println("다섯 자리의 정수 1개 입력 받아 각 자리별로 나누어 출력");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String[] list = str.split("");
//        int b = 10000;
//        for (int i = 0 ; i < list.length; i++) {
//            int a = Integer.parseInt(list[i]);
//            System.out.println("[" + a * b + "]");
//            b /= 10;
//        }
//        scanner.close();

//        26
//        System.out.println("입력되는 시:분:초 에서 분만 출력 ");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String[] list = str.split(":");
//        if(list[1].equals("00")){
//            System.out.println("0");
//        } else{
//            System.out.println(list[1]);
//        }

//        27
//        System.out.println("년월일 yyyy.mm.dd 입력 dd-mm-yyyy로 출력 ");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        String[] list = str.split("\\.");
//        System.out.println(list[2] + "-" + list[1] + "-" + list[0]);

//        28
//        System.out.println("정수 1개를 입력받아 그대로 출력");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        System.out.println(str);

//        29
//        System.out.println("실수 1개를 입력받아 그대로 출력");
//        Scanner scanner = new Scanner(System.in);
//        double str = scanner.nextDouble();
//        System.out.println(str);

//        30
        System.out.println("실수 1개를 입력받아 그대로 출력");
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        System.out.println(num);
    }
}
