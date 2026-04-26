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
}
