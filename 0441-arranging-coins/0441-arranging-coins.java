class Solution {
    public int arrangeCoins(int n) {
         int completeRows = 0;
        int currentRow = 1;
        
        while (n >= currentRow) {
            n -= currentRow;
            completeRows++;
            currentRow++;
        }
        
        return completeRows;
    }
}