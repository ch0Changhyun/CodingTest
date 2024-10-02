package goormlevel;

// import java.io.*;
import java.util.*;

public class NumDeleteArray {

    public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String input = br.readLine();
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄 입력 받기
        int N = sc.nextInt();
        String K = sc.next();

        // 두 번째 줄 입력 받기
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.next();
        }

        // 숫자 문자열 K가 포함되지 않은 요소의 개수 세기
        int count = 0;
        for (String num : array) {
            if (!num.contains(K)) {
                count++;
            }
        }

        System.out.println(count);
    }
}

