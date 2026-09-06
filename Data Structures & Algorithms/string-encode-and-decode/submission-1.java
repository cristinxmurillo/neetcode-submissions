class Solution {

    private final Character separator = 'Ω';

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
            sb.append(separator);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            if (c.equals(separator)) {
                result.add(sb.toString());
                sb.setLength(0);
                continue;
            }
            sb.append(c);
        }
        return result;
    }
}
