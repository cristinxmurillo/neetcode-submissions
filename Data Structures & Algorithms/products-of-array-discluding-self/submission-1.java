class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProducts = new int[nums.length]; //left array
        int[] suffixProducts = new int[nums.length]; //right array
        int[] result = new int[nums.length];

        prefixProducts[0] = 1; //No values before index 0
        suffixProducts[nums.length - 1] = 1; //No values after index nums.length
        int j = nums.length - 2;
        for (int i = 1; i < nums.length; i++) {
            prefixProducts[i] = prefixProducts[i - 1] * nums[i - 1];
            suffixProducts[j] = suffixProducts[j + 1] * nums[j + 1];
            j--;
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefixProducts[i] * suffixProducts[i];
        }

        return result;
    }
}  
