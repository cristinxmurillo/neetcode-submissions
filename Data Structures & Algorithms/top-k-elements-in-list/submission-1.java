class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer>[] bucketSort = new List[nums.length + 1];

        for(Integer num : nums) {
            frequencyMap.computeIfAbsent(num, (f) -> 0);
            frequencyMap.put(num, frequencyMap.get(num) + 1);
        }

        for(int i = 0; i < bucketSort.length; i++) {
            bucketSort[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            bucketSort[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for(int i = bucketSort.length - 1; i > 0 && index < k; i--) {
            for(int num : bucketSort[i]) {
                result[index++] = num;
                if(index == k) {
                    return result;
                }
            }
        }

        return result;   
    }
}
