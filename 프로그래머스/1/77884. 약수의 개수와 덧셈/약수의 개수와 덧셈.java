class Solution {
    public int solution(int left, int right) {
        int total = 0;

        for (int number = left; number <= right; number++) {
            int divisorCount = getDivisorCount(number);
            
            if (divisorCount % 2 == 0) {
                total += number;
            } else {
                total -= number;
            }
        }

        return total;
    }

    // 주어진 숫자의 약수 개수를 계산하는 메서드
    private int getDivisorCount(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

}
