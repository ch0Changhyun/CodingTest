import java.io.*;
import java.util.*;

public class Main {
    private static final String[] NUMBERS_IN_WORDS = {
        "zero", "one", "two", "three", "four", "five",
        "six", "seven", "eight", "nine"
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        List<String> numbersInWords = new ArrayList<>();
        
        for (int i = M; i <= N; i++) {
            numbersInWords.add(toEnglish(i));
        }
        
        Collections.sort(numbersInWords);
        
        int count = 0;
        for (String number : numbersInWords) {
            if (count > 0 && count % 10 == 0) {
                bw.write("\n");
            }
            bw.write(toNumber(number) + " ");
            count++;
        }
        
        bw.flush();
        br.close();
        bw.close();
    }

    private static String toEnglish(int number) {
        if (number < 10) {
            return NUMBERS_IN_WORDS[number];
        }
        return NUMBERS_IN_WORDS[number / 10] + " " + NUMBERS_IN_WORDS[number % 10];
    }

    private static int toNumber(String word) {
        String[] parts = word.split(" ");
        if (parts.length == 1) {
            for (int i = 0; i < NUMBERS_IN_WORDS.length; i++) {
                if (NUMBERS_IN_WORDS[i].equals(parts[0])) {
                    return i;
                }
            }
        } else {
            int tens = 0, units = 0;
            for (int i = 0; i < NUMBERS_IN_WORDS.length; i++) {
                if (NUMBERS_IN_WORDS[i].equals(parts[0])) {
                    tens = i * 10;
                }
                if (NUMBERS_IN_WORDS[i].equals(parts[1])) {
                    units = i;
                }
            }
            return tens + units;
        }
        return -1; // 오류 방지를 위해 기본 값 설정
    }
}
