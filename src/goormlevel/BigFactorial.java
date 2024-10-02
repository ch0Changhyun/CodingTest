package goormlevel;

import java.io.*;
import java.util.*;

public class BigFactorial {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long result = 1;
        int mod = 1000000007;

        for(int i = 1; i <=num; i++){
            result = (result * i) % mod;
        };

        System.out.println(result);
    }
}


