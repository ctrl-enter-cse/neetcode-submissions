
class Solution {
    // for(int i=0;i<nums.length-2;i++){
    //     if(nums[i]<nums[i+1]){
    //         count++;
    //     }
    //     if(nums[i]>nums[i+1]){
    //         if(max<count){
    //             max = count;
    //         }
    //         count=0;
    //     }
    // }
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int max = 1;
        int count = 1;

        int lastSmallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == lastSmallest + 1) {
                count++;
                lastSmallest = nums[i];
            } else if (nums[i] != lastSmallest) {
                count = 1;
                lastSmallest = nums[i];
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
