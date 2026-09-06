class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map Frequencies: key -> num, value -> freq
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Bucket sort: Puts the value in the index according to its frequency
        List<List<Integer>> bucketSort = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            while (bucketSort.size() <= entry.getValue()) {
                bucketSort.add(new ArrayList<>());
            }
            bucketSort.get(entry.getValue()).add(entry.getKey());
        }

        // Get top K values
        int[] result = new int[k];
        int index = 0;
        for (int i = bucketSort.size() - 1; i >= 0; i--) {
            for (Integer value : bucketSort.get(i)) {
                result[index] = value;
                index++;
                if (index == k) {
                    return result;
                }
            }
        }

        return new int[1];
    }
}
