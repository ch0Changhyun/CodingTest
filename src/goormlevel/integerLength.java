package goormlevel;

// 입력된 문자열의 길이 출력 // 정답
// import java.io.*;
// class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String input = br.readLine();
// 		int len = String.valueOf(input).length();
// 		System.out.println(len);
// 	}
// }

// 정수의 길이 // 7/15
// import java.io.*;
// class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String input = br.readLine();

// 		try{
// 			int num = Integer.parseInt(input);
// 			int len = String.valueOf(input).length();
// 			System.out.println(len);
// 		} catch(NumberFormatException e){
// 			System.out.println("유효한 정수를 입력해주세요.");
// 		}
// 	}
// }

// 정답
import java.io.*;

public class integerLength {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int length = input.length(); // 입력된 문자열의 길이를 그대로 사용
        System.out.println(length);
    }
}
