class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String str: details){
            String ageStr = str.substring(11,13);
            int ageInt = Integer.parseInt(ageStr);
                if(ageInt>60){
                    count++;
                }
        }

        return count;
    }
}