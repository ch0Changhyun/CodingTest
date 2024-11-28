class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String maskedPart = "*".repeat(length - 4); 
        String lastFourDigits = phone_number.substring(length - 4); 
       
        return maskedPart + lastFourDigits; 
    }
}