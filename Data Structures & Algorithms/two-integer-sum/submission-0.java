class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a =nums[i];
            int more= target-a;
            if(!mp.containsKey(more)){
                mp.put(nums[i],i);
            }else{
                return new int[]{mp.get(more),i };
            }
        }
        return null;
    }
}
