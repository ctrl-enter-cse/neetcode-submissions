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
        // Arrays.sort(nums);

        // int i = 0;
        // int j = nums.length-1;
        
        // while(i<j){
        //     int sum = nums[i] + nums[j];
        //     if(sum == target){
        //         return new int[]{nums[i],nums[j]};
        //     }
        //     if( sum < target){
        //         i++;
        //     }else if(sum > target){
        //         j--;
        //     }
        // }
        // return new int[]{};
    }
}
