class Solution {
    public String solution(String s) {
        int len = s.length();
        int mid = len / 2;

        if (len % 2 == 0) {
            // 길이가 짝수인 경우 가운데 두 글자를 반환
            return s.substring(mid - 1, mid + 1);
        } else {
            // 길이가 홀수인 경우 가운데 한 글자를 반환
            return s.substring(mid, mid + 1);
        }
    }
}
