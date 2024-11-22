class Solution {
    public boolean solution(int x) {
        // int sum = 0; 
        // int temp = x;
        
        // while(temp > 0){
        //     sum += temp % 10;
        //     temp /= 10;
        // }
        
        String [] temp = String.valueOf(x).split("");
        int sum=0;
        for(String s:temp) {
            sum+=Integer.parseInt(s);
        }
    
        return x % sum == 0;
    }
}