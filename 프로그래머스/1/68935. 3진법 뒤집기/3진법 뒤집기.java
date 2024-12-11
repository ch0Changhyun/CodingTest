class Solution {
    public int solution(int n) {
        // 3진법으로 변환
        String ternary = Integer.toString(n, 3);
        // 3진법을 뒤집기
        String reversed = new StringBuilder(ternary).reverse().toString();
        // 뒤집은 값을 다시 10진법으로 변환
        return Integer.parseInt(reversed, 3);
    }

}
