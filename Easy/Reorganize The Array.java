class Solution 
{
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here
        int n = arr.size();
        int i = 0;
        while(i < n){
            int correct = arr.get(i);
            if(correct != -1 && arr.get(i) != arr.get(correct)){
                arr.set(i, arr.get(correct));
                arr.set(correct, correct);
            }
            else{
                ++i;
            }
        }
        return arr;
    }
}
