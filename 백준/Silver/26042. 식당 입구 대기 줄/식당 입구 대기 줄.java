import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int maxWaitCount = 0;
        int lastStudentNumber = -1;
        int currentWaitCount = 0;

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            if (command[0].equals("1")) {
                int studentNumber = Integer.parseInt(command[1]);
                queue.add(studentNumber);
                currentWaitCount++;
                if (currentWaitCount > maxWaitCount) {
                    maxWaitCount = currentWaitCount;
                    lastStudentNumber = studentNumber;
                } else if (currentWaitCount == maxWaitCount) {
                    lastStudentNumber = Math.min(lastStudentNumber, studentNumber);
                }
            } else if (command[0].equals("2")) {
                queue.poll();
                currentWaitCount--;
            }
        }

        bw.write(maxWaitCount + " " + lastStudentNumber);
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();
    }
}
