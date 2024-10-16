class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int count = 0;
        if(arr.size()>1 && arr.get(0)>arr.get(1))
            count++;
            
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i-1)>arr.get(i))
                count++;
        }
        
        if(count<=4 && count%2 == 0)
        return true;
        else
        return false;
    }
}
