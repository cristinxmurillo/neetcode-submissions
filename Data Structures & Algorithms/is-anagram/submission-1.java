class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < sCharArray.length; i++) {
            Character sChar = sCharArray[i];
            Character tChar = tCharArray[i];

            sMap.computeIfPresent(sChar, (k,v) -> v + 1);
            sMap.computeIfAbsent(sChar, (k) -> 1);

            tMap.computeIfPresent(tChar, (k,v) -> v + 1);
            tMap.computeIfAbsent(tChar, (k) -> 1);
        }          

        return sMap.equals(tMap);
    }
}