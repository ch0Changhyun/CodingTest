import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String[] str = new String[N];
		for(int i=0; i<N; i++)
			str[i] = scan.next();

		for(int i=0; i<str.length-1; i++) {
			for(int j=0; j<str.length; j++) {
				StringBuilder sb2 = new StringBuilder(str[j]);
				// 주어진 문자열과 뒤집어서 쓴 문자열이 같은경우
				if(str[i].equals(sb2.reverse().toString())) {
					
					// 문자열 길이 + " " + 문자열의 가운데 글자 출력
 					System.out.print(str[i].length() + " " + str[i].charAt(str[i].length()/2));
					return;
				}
			}
		}
		
		scan.close();
	}

}
