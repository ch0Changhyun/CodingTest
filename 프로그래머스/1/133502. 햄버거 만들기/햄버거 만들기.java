import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int burgerCount = 0;
        
        for (int ing : ingredient) {
            stack.push(ing);
            
            // 스택의 크기가 4 이상이고, 마지막 4개의 재료가 [빵, 야채, 고기, 빵] 순서인 경우
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 && stack.get(size - 3) == 2 &&
                    stack.get(size - 2) == 3 && stack.get(size - 1) == 1) {
                    // 마지막 4개의 재료를 제거하고 햄버거 하나를 카운트
                    for (int i = 0; i < 4; i++) {
                        stack.pop();
                    }
                    burgerCount++;
                }
            }
        }
        
        return burgerCount;
    }
}
