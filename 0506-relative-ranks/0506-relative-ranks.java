class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] result=new String[n];
        Integer[] index=new Integer[n];
        for(int i=0;i<n;i++) index[i]=i;
        Arrays.sort(index,(a,b)->score[b]-score[a]);
        for(int i=0;i<n;i++){
            int j=index[i];
            if(i==0) result[j]="Gold Medal";
            else if(i==1) result[j]="Silver Medal";
            else if(i==2) result[j]="Bronze Medal";
            else result[j]=String.valueOf(i+1);
        }
        return result;
    }
}