import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        // X와 Y에서 각각 숫자의 빈도를 셉니다.
        for (char ch : X.toCharArray()) {
            countX[ch - '0']++;
        }
        for (char ch : Y.toCharArray()) {
            countY[ch - '0']++;
        }

        // 공통으로 나타나는 숫자를 큰 수부터 작은 수로 정렬하여 결과를 만듭니다.
        StringBuilder result = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                result.append(i);
            }
        }

        // 결과가 비어있으면 짝꿍이 없는 것이므로 -1 반환
        if (result.length() == 0) {
            return "-1";
        }

        // 결과가 "0"으로만 구성되어 있으면 "0" 반환
        if (result.charAt(0) == '0') {
            return "0";
        }

        return result.toString();
    }

}
