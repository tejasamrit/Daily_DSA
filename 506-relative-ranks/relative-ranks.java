class Solution {
    public int max(int score[]){
        int max=Integer.MIN_VALUE;
        for(int i:score){
            max=Math.max(max,i);
        }
        return max;
    }
    public String[] findRelativeRanks(int[] score) {
        int maxval=max(score);
        int map[]=new int[maxval+1];
        for(int i=0;i<score.length;i++){
            map[score[i]]=i+1;
        }
        String res[]=new String[score.length];
        int rank=1;
        for(int i=maxval;i>=0;i--){
            if(map[i]!=0){
                int index=map[i]-1;
                if(rank==1){
                    res[index]="Gold Medal";
                }else if(rank==2){
                    res[index]="Silver Medal";
                }else if(rank==3){
                    res[index]="Bronze Medal";
                }else{
                    res[index]=Integer.toString(rank);
                }
                rank++;
            }
            if(rank>score.length)break;
        }
        return res;
    }
}