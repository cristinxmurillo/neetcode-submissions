class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();

        for(String str : strs) {
            int[] letterCount = new int[26];
            for (char c : str.toCharArray()) {
                letterCount[c - 'a']++;
            }
            String key = Arrays.toString(letterCount);
            groups.computeIfAbsent(key, (k) -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(groups.values());
    }
}
