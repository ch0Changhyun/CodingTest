class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length + 1];
        int last = 0;
        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]){
            last = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else{
            last = num_list[num_list.length - 1 ] * 2;
        }
        for(int i = 0; i < num_list.length; i++){
            result[i] = num_list[i];
        }
        result[result.length - 1] = last;
        return result;
    }
}