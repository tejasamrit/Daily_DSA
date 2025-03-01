class Solution {
    public String makeGood(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && Math.abs(st.peek()-ch)==32){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        String ans=new String();
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}