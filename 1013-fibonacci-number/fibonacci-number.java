class Solution {
    public int fib(int n) {
        if(n<=1)return n;
        int f1=1;
        int f2=1;
        return fib(n-1)+fib(n-2);
    }
}