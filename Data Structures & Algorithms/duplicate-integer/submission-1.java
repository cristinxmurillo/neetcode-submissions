class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsChecked = new HashSet<Integer> ();

        for (int num : nums) {
            if(numsChecked.contains(num)) {
                return true;
            }
            numsChecked.add(num);
        }

        return false;
    }
}