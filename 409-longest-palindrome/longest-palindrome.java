class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character>set=new HashSet<>();
        int res=0;
        for(char ch:s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
            }else{
                res+=2;
                set.remove(ch);
            }
        }
        if(set.size()>0){
            res+=1;
        }
        return res;
    }
}