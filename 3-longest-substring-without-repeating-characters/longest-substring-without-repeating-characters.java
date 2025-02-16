class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character>set=new HashSet<>();
        int st=0,end=0;
        int len=0;
        while(end<n){
            char ch=s.charAt(end);
            if(set.contains(ch)){
                while(st<end && set.contains(ch)){
                    set.remove(s.charAt(st));
                    st++;
                }
            }
            set.add(ch);
            len=Math.max(len,(end-st+1));
            end++;
        }
        return len;
    }
}