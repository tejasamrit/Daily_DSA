class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            int sq=0;
            while(n!=0){
                int rem=n%10;
                sq+=rem*rem;
                n=n/10;
            }
            n=sq;
        }
        return n==1;
    }
}