class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray(); 
            Arrays.sort(chars); 
            String sortedWord = new String(chars);

            if (!groups.containsKey(sortedWord)) {
                groups.put(sortedWord, new ArrayList<String>());
            }
            groups.get(sortedWord).add(word);
        }

        return new ArrayList<>(groups.values());
    }
}
