class Solution {
    public int maxStep(int arr[]) {
        int max=0;
        int curr=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                curr++;
                
            }else{
                curr=0;
            }
            max=Math.max(curr,max);
        }
        return max;
    }
}
