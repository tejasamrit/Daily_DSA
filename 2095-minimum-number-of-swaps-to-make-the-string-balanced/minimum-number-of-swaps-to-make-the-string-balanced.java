class Solution {
    public int minSwaps(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty() || st.peek()==']'){
                    st.push(ch);
                }
                else{
                    st.pop();
                }
            }
        }
        int stackSize=st.size();
        int ans= stackSize/2;
        return (ans+1)/2;
    }
}