class Solution {

    
    int maxSubarraySum(int[] arr) {

        // Initialize maxSum to the smallest possible integer value
        int maxSum = Integer.MIN_VALUE;
        
        // Initialize localSum to 0
        int localSum = 0;
        
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to localSum
            localSum += arr[i];
        
            // Update maxSum if localSum is greater than maxSum
            if (localSum > maxSum) {
                maxSum = localSum;
            }
            
            // Reset localSum to 0 if it becomes negative
            if (localSum < 0) {
                localSum = 0;
            }
        }
        
        // Return the maximum sum found
        return maxSum;
    }
}
