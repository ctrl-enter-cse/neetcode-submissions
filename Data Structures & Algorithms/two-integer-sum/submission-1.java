class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int more= target-a;
            if(mp.containsKey(more)){
                return new int[]{mp.get(more),i };
                
            }mp.put(nums[i],i);
        }
        return new int[]{};
    }
}
