package goormlevel;

import java.io.*;
public class sumAB2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
