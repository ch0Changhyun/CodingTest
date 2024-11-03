import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정환이 아는 노래의 개수
        int M = Integer.parseInt(st.nextToken()); // 맞히기를 시도할 노래의 개수

        Map<String, String> songMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken()); // 노래 제목의 길이
            String S = st.nextToken(); // 노래 제목
            StringBuilder notes = new StringBuilder();
            for (int j = 0; j < 7; j++) {
                notes.append(st.nextToken());
            }
            String firstThreeNotes = notes.substring(0, 3);
            if (songMap.containsKey(firstThreeNotes)) {
                songMap.put(firstThreeNotes, "?");
            } else {
                songMap.put(firstThreeNotes, S);
            }
        }

        for (int i = 0; i < M; i++) {
            String attempt = br.readLine().replace(" ", "");
            if (songMap.containsKey(attempt)) {
                bw.write(songMap.get(attempt));
            } else {
                bw.write("!");
            }
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
