
class Solution {
    public long solution(long n) {
        // n의 제곱근 구하기
        long sqrt = (long) Math.sqrt(n);
        
        // 제곱근의 제곱이 n과 같은지 확인
        if (sqrt * sqrt == n) {
            // (x+1)의 제곱 반환
            return (sqrt + 1) * (sqrt + 1);
        } else {
            // 정수가 아닌 경우 -1 반환
            return -1;
        }
    }

}
