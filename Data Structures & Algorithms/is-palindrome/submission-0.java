class Solution {
    public boolean isPalindrome(String s) {
        String str= s.trim();
        str=str.toLowerCase();
        
        char[] strArray = str.toCharArray();
        char[] result = new char[strArray.length];
        int j=0;
        for(char ch :strArray){
            if((ch>='a' &&ch<='z')||(ch>='0'&&ch<='9')){
                result[j++]=ch;
            }
        }

        int i=0;
        while(i<j){
            int k = j-1-i;
            if(result[i] != result[k]){
                return false;
            }
            i++;
        }
        return true;
    }
}
