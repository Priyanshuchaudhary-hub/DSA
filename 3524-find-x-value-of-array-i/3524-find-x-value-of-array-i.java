class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] ans = new long[k];
        long[] dp = new long[k];
        for (int num : nums) {
            int mod = num % k;
            long[] newDp = new long[k];
            // Start a new subarray
            newDp[mod] = 1;
            // Extend previous subarrays
            for (int r = 0; r < k; r++) {
                int newMod = (int) ((long) r * mod % k);
                newDp[newMod] += dp[r];
            }
            // Add current subarrays to answer
            for (int r = 0; r < k; r++) {
                ans[r] += newDp[r];
            }
            dp = newDp;
        }
        return ans;
    }
}