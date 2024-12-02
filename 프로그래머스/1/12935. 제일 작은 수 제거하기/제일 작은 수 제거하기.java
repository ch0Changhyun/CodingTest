import java.util.*;


class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1}; // 배열이 한 개의 요소만 가진 경우
        }

        // 가장 작은 수를 찾기
        int min = Arrays.stream(arr).min().getAsInt();

        // 가장 작은 수를 제거한 배열을 만들기 위해 리스트 사용
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != min) {
                list.add(num);
            }
        }

        // 리스트를 배열로 변환하여 반환
        return list.stream().mapToInt(i -> i).toArray();
    }

}
