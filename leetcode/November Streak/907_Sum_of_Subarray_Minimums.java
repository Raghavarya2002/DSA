class Solution {
        public int sumSubarrayMins(int[] arr) {
        final int modulo = 1_000_000_007;

        int[] stack = new int[arr.length + 1];
        int idxStack = 0;

        int[] dp = new int[arr.length];
        dp[0] = arr[0];

        long res = dp[0];
        for (int i = 1; i < arr.length; i++) {
            while (idxStack >= 0 && arr[stack[idxStack]] >= arr[i]) idxStack--;//pop
            dp[i] = idxStack < 0 ? arr[i] * (i + 1) : dp[stack[idxStack]] + arr[i] * (i - stack[idxStack]);
            res += dp[i];
            stack[++idxStack] = i;//push
        }

        return (int) (res % modulo);
    }
}
