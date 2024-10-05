class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        long smallest = 1; // Step 2: Initialize smallest to 1
        
        // Step 3: Iterate through the sorted array
        for (int num : arr) {
            if (num > smallest) {
                // If the current number is greater than smallest,
                // we cannot form smallest using the previous numbers
                break;
            }
            smallest += num; // If num <= smallest, update smallest
        }
        
        // Step 4: Return the result
        return smallest;
        
    }
}
