import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int previous = -1;
        
        for(int num : arr){
            if(num != previous){
                result.add(num);
                previous = num;
            }
        }
        int[] answer = new int[result.size()];
     for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }   
        return answer;
    }
}