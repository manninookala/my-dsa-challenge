import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Approach-1 (Brute-force)
        // int[] result = new int[2];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j] == target){
        //             result[0] = i;
        //             result[1] = j;
        //             return result;
        //         }
        //     }
        // }
        // return null;   

        //Approach-2 HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int remains = target - nums[i];
            if(map.containsKey(remains)){
                return new int[] {map.get(remains), i};
            }
            map.put(nums[i], i);
        }
        return nums;     
    }
}