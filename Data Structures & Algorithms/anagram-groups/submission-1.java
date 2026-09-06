class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {
            int[] count = new int[26];
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            groups.putIfAbsent(key, new ArrayList<String>());
            groups.get(key).add(word);
        }

        return new ArrayList<>(groups.values());
    }
}
