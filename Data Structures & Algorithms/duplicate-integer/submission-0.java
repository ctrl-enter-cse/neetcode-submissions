class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Map <Integer,Integer> mp = new HashMap<>();
        // for(int n: nums){
        //     mp.put(n, mp.getOrDefault(n, 0)+1);
        // }
        // System.out.println(mp);
        // if(Entry.map() :mp.entrySet())
        // return true;

        Set<Integer> set= new HashSet<>();
        for(int n: nums){
            if(!set.add(n)){
                    return true;
            }
        }
        return false;
    }

}