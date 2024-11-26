import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>(); 
        
        // 각 원소가 divisor로 나누어 떨어지는지 확인 
        for (int num : arr) { 
            if (num % divisor == 0) { 
                list.add(num); 
            } 
        } 
        
        // 조건에 맞는 원소가 하나도 없으면 -1을 담은 배열 반환 
        if (list.isEmpty()) { 
            return new int[]{-1}; 
        } 
        
        // 오름차순 정렬 
        Collections.sort(list); 
        
        // ArrayList를 배열로 변환하여 반환 
        int[] result = new int[list.size()]; 
        for (int i = 0; i < list.size(); i++) { 
            result[i] = list.get(i); 
        } 
        return result; 
    }
}