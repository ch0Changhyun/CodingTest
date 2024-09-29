package goormlevel;

import java.io.*;

public class sumAB {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        double num1 = Double.parseDouble(input[0]);
        double num2 = Double.parseDouble(input[1]);
        double sum = num1 + num2;
        System.out.printf("%.6f", sum);
    }
}

