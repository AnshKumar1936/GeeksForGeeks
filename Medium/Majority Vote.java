class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.size();i++){
            int temp = nums.get(i);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }
            else{
                map.put(temp,1);
            }
        }
        int higest_votes = nums.size()/3;
        for(int i=0;i<nums.size();i++){
            int temp = nums.get(i);
            if(map.containsKey(temp) && map.get(temp) > higest_votes){
                list.add(temp);
                map.remove(temp);
            }
        }
        if(list.size()==0){
            list.add(-1);
        }
        
        return list;
    }
