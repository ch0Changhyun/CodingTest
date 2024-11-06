import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int maxTypes = nums.length / 2;
        
        HashSet<Integer> uniqueTypes = new HashSet<>();
        for (int num : nums){
            uniqueTypes.add(num);
        }
        return Math.min(maxTypes, uniqueTypes.size());
    }
}
// import java.util.*;
// class Solution {
//     public int solution(int[] nums) {
//         int maxSelect = nums.length / 2;
        
//         Set<Integer> uniquePokemons = new HashSet<>(); 
//         for (int num : nums) { 
//             uniquePokemons.add(num); 
//         }
//         return Math.min(uniquePokemons.size(), maxSelect); 
//     }
// }