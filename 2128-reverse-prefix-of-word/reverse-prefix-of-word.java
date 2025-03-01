class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character>st=new Stack<>();
        String ans="";
        for(int i=0;i<word.length();i++){
            char currchar=word.charAt(i);
            st.push(currchar);
            if(currchar==ch){
                while(!st.isEmpty()){
                    ans=ans+st.pop();
                }
                ans=ans+word.substring(i+1,word.length());
                return ans;
            }
        }
        return word;
    }
}