class Solution {
    public String findOrder(String[] dict, int n, int k) {
        // Write your code here
        /*
            My appraoch for solving
            1-convert dictonary to graph
            2-apply topology sort
            3-return ans and if cycle return empty string
        */
        //convert graph
        HashMap<Character,ArrayList<Character>> map=new HashMap<>();
        for(int i=1;i<dict.length;i++){
            String str1=dict[i-1].toLowerCase();
            String str2=dict[i].toLowerCase();
            int s1=0;
            int len = Math.min(str1.length(), str2.length());
            while(s1<len  && str1.charAt(s1)==str2.charAt(s1)){
                s1++;
            }
            if(s1>=len) continue;
            map.computeIfAbsent(str1.charAt(s1),p->new ArrayList<>()).add(str2.charAt(s1));
        }
        // Apply topology sort usinh kahn's algo
        int []inDegree=new int[k];
        for(char i:map.keySet()){
            for(char j:map.get(i)){
                inDegree[j-'a']++;
            }
        }
        String ans="";
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<k;i++){
            if(inDegree[i]==0){
                char ch=(char)(i+'a');
                q.add(ch);
            }
        }
        while(!q.isEmpty()){
            char ch=q.poll();
            ans+=ch;
            if(map.containsKey(ch)){
                for(char j:map.get(ch)){
                     inDegree[j-'a']--;
                     if(inDegree[j-'a']==0){
                         q.add(j);
                     }
                }
            }
        }
        
        if(ans.length()!=k){
            return ""; //if cycle return empty string
        }
        return ans;
    }
}
