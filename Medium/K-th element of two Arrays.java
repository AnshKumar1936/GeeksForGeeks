class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int num : arr1)   // add elements of arr1 to ArrayList
            al.add(num);
            
        for(int num : arr2)   // add elements of arr1 to ArrayList
            al.add(num);
            
        Collections.sort(al);   // Sort ArrayList
        return al.get(k-1);
    }
}
