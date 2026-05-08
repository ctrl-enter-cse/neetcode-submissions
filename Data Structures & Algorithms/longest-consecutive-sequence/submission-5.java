
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
    //     if (nums.length == 0)
    //         return 0;
    //     Arrays.sort(nums);
    //     int max = 1;
    //     int count = 1;

    //     int lastSmallest = nums[0];
    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[i] == lastSmallest + 1) {
    //             count++;
    //             lastSmallest = nums[i];
    //         } else if (nums[i] != lastSmallest) {
    //             count = 1;
    //             lastSmallest = nums[i];
    //         }
    //         max = Math.max(max, count);
    //     }
    //     return max;
    // }
    // public int longestConsecutive(int[] nums) {
    //     Set<Integer> numSet = new HashSet<>();
    //     for (int num : nums) numSet.add(num);

    //     int longest = 0;

    //     for (int num : numSet) {
    //         // Check if 'num' is the start of a sequence
    //         if (!numSet.contains(num - 1)) {
    //             int currentNum = num;
    //             int currentStreak = 1;

    //             // Count how far the sequence goes
    //             while (numSet.contains(currentNum + 1)) {
    //                 currentNum += 1;
    //                 currentStreak += 1;
    //             }

    //             longest = Math.max(longest, currentStreak);
    //         }
    //     }

    //     return longest;
    //  }
    if(nums.length==0) return 0;
    Set<Integer> numSet = new HashSet<>();
    for( int i : nums){
            numSet.add(i);
    }
    int longest =1;
    for( int i :numSet){
        if(!numSet.contains(i-1)){
            int currentNum = i;
            int currentStreak = 1;
             while(numSet.contains(currentNum +1)){
                currentNum+=1;
                currentStreak+=1;
             }
             longest= Math.max(currentStreak,longest);
        }
    }
    return longest;
    }
}
