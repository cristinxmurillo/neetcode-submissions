class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);

            sMap.computeIfPresent(sChar, (k,v) -> v + 1);
            sMap.computeIfAbsent(sChar, (k) -> 1);

            tMap.computeIfPresent(tChar, (k,v) -> v + 1);
            tMap.computeIfAbsent(tChar, (k) -> 1);
        }          

        return sMap.equals(tMap);
    }
}