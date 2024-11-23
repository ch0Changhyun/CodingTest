import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트 케이스의 수
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            // 각 테스트 케이스마다 학교의 수
            int N = Integer.parseInt(br.readLine());
            String maxSchool = "";
            int maxL = -1;
            
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String schoolName = st.nextToken();
                int L = Integer.parseInt(st.nextToken());
                
                // 가장 술 소비가 많은 학교를 찾는다
                if (L > maxL) {
                    maxL = L;
                    maxSchool = schoolName;
                }
            }
            
            // 결과 출력
            System.out.println(maxSchool);
        }
    }
}
