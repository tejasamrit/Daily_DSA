class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty() || arr[i]>0){
                st.push(arr[i]);
            }else{
                while(!st.isEmpty()){
                    int top=st.peek();
                    if(top<0){
                        st.push(arr[i]);
                        break;
                    }
                    int ModVal=Math.abs(arr[i]);
                    if(ModVal==top){
                        st.pop();
                        break;
                    }
                    else if(ModVal <top)break;
                    else{
                        st.pop();
                        if(st.isEmpty()){
                            st.push(arr[i]);
                            break;
                        }
                    }
                }
            }
        }
        int n=st.size();
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}