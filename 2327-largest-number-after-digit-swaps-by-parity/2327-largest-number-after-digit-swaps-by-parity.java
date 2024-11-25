import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int largestInteger(int num) {
        String numStr = String.valueOf(num);
        List<Integer> evenDigits = new ArrayList<>();
        List<Integer> oddDigits = new ArrayList<>();

        // 짝수와 홀수 자리수를 분리합니다.
        for (char digit : numStr.toCharArray()) {
            int d = Character.getNumericValue(digit);
            if (d % 2 == 0) {
                evenDigits.add(d);
            } else {
                oddDigits.add(d);
            }
        }

        // 짝수와 홀수 자리수를 내림차순으로 정렬합니다.
        Collections.sort(evenDigits, Collections.reverseOrder());
        Collections.sort(oddDigits, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        int evenIndex = 0;
        int oddIndex = 0;

        // 짝수와 홀수 자리수를 자리수에 맞게 재배치합니다.
        for (char digit : numStr.toCharArray()) {
            int d = Character.getNumericValue(digit);
            if (d % 2 == 0) {
                result.append(evenDigits.get(evenIndex++));
            } else {
                result.append(oddDigits.get(oddIndex++));
            }
        }

        return Integer.parseInt(result.toString());
    }

    // public static void main(String[] args) {
    //     Solution sol = new Solution();
        
    //     // 테스트 케이스
    //     System.out.println(sol.largestInteger(1234)); // 출력: 3412
    //     System.out.println(sol.largestInteger(65875)); // 출력: 87655
    // }
}
