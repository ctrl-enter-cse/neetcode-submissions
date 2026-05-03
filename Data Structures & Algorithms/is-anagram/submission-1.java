class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1new = s.toCharArray();
        Arrays.sort(s1new);

        char[] s2new = t.toCharArray();
        Arrays.sort(s2new);
        if(s1new.length!=s2new.length) return false;
        for (int i = 0; i < s2new.length; i++) {
            if(s1new[i]!=s2new[i]) return false;
        }
        return true;
    }
}
