class Solution {
    public int solution(int[] number) {
        int count = 0;
        int n = number.length;
        
        // 3명의 학생을 선택하는 모든 조합을 검사
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}
