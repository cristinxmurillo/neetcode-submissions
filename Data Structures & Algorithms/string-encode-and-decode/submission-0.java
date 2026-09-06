class Solution {

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs) {
            stringBuilder.append(str);
            stringBuilder.append("Ω");
        }
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        char[] chars = str.toCharArray();
        List<String> result = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (c == 'Ω') {
                result.add(stringBuilder.toString());
                stringBuilder.setLength(0);
                continue;
            }
            stringBuilder.append(c);
        }
        return result;
    }
}
