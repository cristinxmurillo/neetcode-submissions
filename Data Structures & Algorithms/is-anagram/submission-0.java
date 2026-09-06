class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();

        for(char character : s.toCharArray()) {
            if (sMap.get(character) != null) {
                sMap.put(character, sMap.get(character) + 1);
            } else {
                sMap.put(character, 1);
            }
        }

        for(char character : t.toCharArray()) {
            if (tMap.get(character) != null) {
                tMap.put(character, tMap.get(character) + 1);
            } else {
                tMap.put(character, 1);
            }
        }

        return tMap.equals(sMap);
    }
}
