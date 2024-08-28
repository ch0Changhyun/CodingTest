class Solution {
    public int longestPalindrome(String s) {
        // Step 1: Count the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Step 2: Calculate the length of the longest palindrome
        int length = 0;
        boolean hasOdd = false;
        for (int count : charCount.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        // If there is at least one character with an odd count, we can add one to the length
        if (hasOdd) {
            length += 1;
        }

        return length;
    }
}