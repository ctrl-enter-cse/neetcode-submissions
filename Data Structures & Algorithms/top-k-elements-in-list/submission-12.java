class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int n : nums) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }

        // 1. Put keys into a list and sort by frequency (value)
        List<Integer> list = new ArrayList<>(mp.keySet());
        list.sort((a, b) -> mp.get(b) - mp.get(a)); // Sort descending

        // 2. Now pick the top k
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }
        
        return res;
    }
    // {
    //     Map<Integer, Integer> mp = new HashMap();

    //     for (int i : nums) {
    //         mp.put(i, mp.getOrDefault(i, 0) + 1);
    //     }
        
    //     int[] res = new int[k];
    //     int i = 0;

    //     for (Map.Entry<Integer, Integer> ent : mp.entrySet()) {
    //         if (ent.getValue() >= Integer.valueOf(k)) {
    //             res[i++] = ent.getKey();
    //             if(i==k-1)break;
    //         }
    //     }
    //     return res;
    // }
    /**A Concrete Example
Imagine your input is nums = [1, 1, 1, 2, 2, 3].
Your Map mp would look like this:

1 appears 3 times: mp.get(1) = 3

2 appears 2 times: mp.get(2) = 2

3 appears 1 time:  mp.get(3) = 1

Your list initially contains the keys: [1, 2, 3]. When the sort runs, it picks two numbers to compare (e.g., a = 2 and b = 1):

Look up frequencies: mp.get(b) is 3, and mp.get(a) is 2.

The Calculation: 3 - 2 = 1.

The Result: Since 1 is positive, Java knows that b (the number 1) has a higher frequency and should come before a (the number 2).

If you had used mp.get(a) - mp.get(b), the result would have been -1 (negative), which would sort them in ascending order (least frequent to most frequent).*/
}
