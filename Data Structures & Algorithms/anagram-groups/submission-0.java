class Solution {
        /**
         * use the hash map sort and find the sorted string in hash is present then add in the value list n go forword
         * for sorting it will take O(n log n)
         * to handle this we can create int[26] -{alphabets chr} and update that 0 to 1 , 2 so one until the string finishort
         * this will get the unquie code but we need unqiue for anding any symbol to make it unqiue as aaaaaab && abbbbbb will have the same hashcode so appened the any symbol such that it make the unqiue hascode unque
         * for any string s ;  if alphabet are same then hashcode will be same and that is whatwe wAtomicInteger
         * and then simple add into hashmap of the key as hashcode and all the value in list<String> 
        **/

         
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String,List> map =  new HashMap();
        for(String s: strs){
            int[] count= new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int sc : count){
                sb.append("#");
                sb.append(sc);
            }
            String key = sb.toString();
        
            if(!map.containsKey(key)){
                map.put(key , new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }

        
}
