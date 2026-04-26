class Solution {

   // Encode a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            int len = s.length();
            sb.append(len).append('#').append(s);
        }
        return sb.toString();
    }

    // Decode a single string back to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            // read length until '#'
            int j = i;
            while (j < s.length() && s.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(s.substring(i, j));
            // move past '#'
            j++; 
            // extract the next 'len' characters
            String part = s.substring(j, j + len);
            res.add(part);
            // move to the start of the next entry
            i = j + len;
        }
        return res;
    }
}
