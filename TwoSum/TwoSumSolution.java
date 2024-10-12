import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> table  = new Hashtable<>();
        int complement;
        int[] pair = new int[2];

        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];

            if(table.containsKey(complement)){
                pair[0] = table.get(complement);
                pair[1] = i;
                return pair;
            }

            table.put(nums[i], i);
        }

        return pair;
    }
}
