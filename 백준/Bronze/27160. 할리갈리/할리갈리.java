import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // 카드의 개수
        scanner.nextLine(); // 개행 문자 제거
        
        Map<String, Integer> fruitCount = new HashMap<>();
        fruitCount.put("STRAWBERRY", 0);
        fruitCount.put("BANANA", 0);
        fruitCount.put("LIME", 0);
        fruitCount.put("PLUM", 0);
        
        for (int i = 0; i < N; i++) {
            String fruit = scanner.next();
            int count = scanner.nextInt();
            fruitCount.put(fruit, fruitCount.get(fruit) + count);
        }
        
        scanner.close();
        
        if (fruitCount.containsValue(5)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
