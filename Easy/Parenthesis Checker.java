class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
                Stack<Character> s=new Stack<>();
        for(int i=0;i<x.length();i++){
            if(!s.isEmpty()&&x.charAt(i)==')'&&s.peek()=='('){
                s.pop();
            }
            else if(!s.isEmpty()&&x.charAt(i)==']'&&s.peek()=='['){
                s.pop();
            }else if(!s.isEmpty()&&x.charAt(i)=='}'&&s.peek()=='{'){
                s.pop();
            }
            else{
                s.push(x.charAt(i));
            }
        }
        return s.isEmpty();
    }
}
