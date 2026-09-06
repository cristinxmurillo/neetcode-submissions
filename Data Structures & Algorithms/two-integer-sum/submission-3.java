class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsIndex = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int targetSum = target - nums[i];
            if(numsIndex.containsKey(targetSum)) { 
                return new int[]{numsIndex.get(targetSum), i};
            }
            else {
                numsIndex.put(nums[i], i);
            }
        }

        return null;
    }
}
