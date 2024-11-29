import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        boolean[] isPresent = new boolean[10];
        
        for(int num : numbers){
            isPresent[num] = true;
        }
        for(int i = 0; i < 10; i++){
            if(!isPresent[i]){
            sum += i;
            }
        }
        return sum;
    }
}