import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int totalMin = A * 60 + B + C;
        
        int newH = (totalMin / 60) % 24;
        int newM = totalMin % 60;
        
        System.out.println(newH + " " + newM);
        
        sc.close();
    }
}