package goormlevel;

 import java.io.*;
public class convertUpperLower {
 	public static void main(String[] args) throws Exception {
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		String input = br.readLine();
 		char[] ch  = input.toCharArray();
 		for(char c : ch){
 			if (Character.isUpperCase(c)) {
 				c = Character.toLowerCase(c);
 			} else {
 				c = Character.toUpperCase(c);
 			}
 				System.out.print(c);
 		}
 	}
 }

// runtime error
// import java.io.*;

// class Main {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine().trim()); // 첫 번째 줄에서 숫자 입력 받기 / trim() 메서드 추가: 입력 문자열의 앞뒤 공백을 제거하여 불필요한 공백으로 인한 오류를 방지
//         for (int i = 0; i < n; i++) {
//             String input = br.readLine().trim();
//             char[] ch = input.toCharArray();
//             for (char c : ch) {
//                 if (Character.isUpperCase(c)) {
//                     c = Character.toLowerCase(c);
//                 } else if (Character.isLowerCase(c)) {
//                     c = Character.toUpperCase(c);
//                 }
//                 System.out.print(c);
//             }
//             System.out.println(); // 각 줄의 변환 결과를 출력한 후 줄 바꿈
//         }
//     }
// }

