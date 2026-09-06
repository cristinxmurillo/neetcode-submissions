class Solution {
    public int[] twoSum(int[] nums, int target) {
        int targetSum;
        
        for (int i = 0; i < nums.length - 1; i++) {
            targetSum = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == targetSum) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
