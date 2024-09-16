class Solution{
    static int maxLength(String s){
        // code here
   int n = s.length();
    int[] dp = new int[n];
    int maxLen = 0;
    for (int i = 1; i < n; i++) {
        if (s.charAt(i) == ')') {
            if (s.charAt(i - 1) == '(') {
                dp[i] = 2;
                if (i - 2 >= 0) {
                    dp[i] += dp[i - 2];
                }
            } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                dp[i] = dp[i - 1] + 2;
                if (i - dp[i - 1] - 2 >= 0) {
                    dp[i] += dp[i - dp[i - 1] - 2];
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
    }
    return maxLen;
    }
}
