class Solution {
    public int findComplement(int num) {
        int len=(int)(Math.log(num)/Math.log(2))+1;
        int mask=(1<<len)-1;
        return mask^num;
    }
}