class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List result = new ArrayList();
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
