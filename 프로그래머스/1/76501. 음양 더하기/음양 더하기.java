class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
     int answer = 0; 
        for (int i = 0; i < absolutes.length; i++) { 
            if (signs[i]) { 
                answer += absolutes[i]; // 부호가 양수인 경우 
            } else { answer -= absolutes[i]; // 부호가 음수인 경우 
                   } 
        } 
        return answer;
    }
}