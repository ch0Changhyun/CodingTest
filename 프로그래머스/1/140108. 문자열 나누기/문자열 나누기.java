class Solution {
    public int solution(String s) {
        int count = 0;
        int i = 0;
        while(i < s.length()){
            char x = s.charAt(i);
            int xCount = 0;
            int otherCount = 0;
            
            while (i < s.length()) {
                if (s.charAt(i) == x) {
                    xCount++;
                } else {
                    otherCount++;
                }
                i++;

                if (xCount == otherCount) {
                    count++;
                    break;
                }
            }

            if (xCount != otherCount) {
                count++;
            }
        }

        return count;
    }
}