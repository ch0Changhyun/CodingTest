import java.math.BigInteger;

class Solution {
    public int solution(String t, String p) {
        int count = 0;
        BigInteger pNum =  new BigInteger(p);
        int len = p.length();
        
        for(int i = 0; i<=t.length() - len; i++){
            BigInteger num = new BigInteger(t.substring(i, i+ len));
            if(num.compareTo(pNum) <= 0){
                count++;
            }
        }
        return count;
    }
}