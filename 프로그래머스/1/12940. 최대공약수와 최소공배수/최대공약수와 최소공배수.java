class Solution {
    public int[] solution(int a, int b) {
        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;
        return new int[] {gcd, lcm};
    }

    // 유클리드 호제법을 사용한 GCD 계산
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
