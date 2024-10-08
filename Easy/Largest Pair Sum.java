class Solution {
    public static int pairsum(int[] arr) {
        // code here
        Arrays.sort(arr);
        int max =Integer.MIN_VALUE;
        int i=0;
        int j=i+1;
        int n=arr.length;
        while(i<n && j<n) {
            if(arr[i]+arr[j]>max) max=arr[i]+arr[j];
            i++;
            j++;
        }
        return max;
    }
}
