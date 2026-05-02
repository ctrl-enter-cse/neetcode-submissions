class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // if(k==1) return nums;
        List result = new ArrayList();
        int [] res= new int[nums.length-1];
        for(int i=0;i<nums.length-(k-1);i++){
            int max=nums[i];
            for( int j=i;j<i+k;j++){
              max = Math.max(max,nums[j]);
            }
            result.add(max);
        }
        return result.stream()
                        .mapToInt(i -> (int) i)
                        .toArray();
    }
}
