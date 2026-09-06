class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numSet = new HashMap<>();

        int complement;
        for(int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (numSet.containsKey(complement)) {
                return new int[] {numSet.get(complement), i};
            } else {
                numSet.put(nums[i], i);
            }
        }

        return new int[] {0, 0};
    }
}
