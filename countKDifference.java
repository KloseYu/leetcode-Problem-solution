class Solution {
    public int countKDifference(int[] nums, int k) {
         int res = 0;
    for (int i = 0; i < nums.length; ++i) {
        for (int j = i + 1; j < nums.length; ++j) {
            if (Math.abs(nums[i] - nums[j]) == k) {
                ++res;
            }
        }
    }
    return res;
    }
}
/*class Solution {
    public int countKDifference(int[] nums, int k) {
      int res = 0;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (int j = 0; j < nums.length; ++j) {
            res += cnt.getOrDefault(nums[j] - k, 0) + cnt.getOrDefault(nums[j] + k, 0);
            cnt.put(nums[j], cnt.getOrDefault(nums[j], 0) + 1);
        }
        return res;
    }
}*/

