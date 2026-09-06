class Solution {

    //Generalized algorithm to work in any set of characters

    private Character delimiter = '#';

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length());
            sb.append(delimiter);
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int size = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!delimiter.equals(str.charAt(i))) {
                sb.append(str.charAt(i));
            } else {
                System.out.print(sb.toString());
                size = Integer.valueOf(sb.toString());
                result.add(str.substring(i + 1, i + size + 1));
                sb.setLength(0);
                i = i + size;
            }
        }

        return result;
    }
}
