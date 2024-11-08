import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            
            if (command.startsWith("push")) {
                String[] parts = command.split(" ");
                int value = Integer.parseInt(parts[1]);
                stack.push(value);
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            } else if (command.equals("size")) {
                bw.write(stack.size() + "\n");
            } else if (command.equals("empty")) {
                bw.write(stack.isEmpty() ? "1\n" : "0\n");
            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
