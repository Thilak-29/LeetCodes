class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        double windsum = 0;
        int count = 0;
        for(int i=0;i<k;i++){
            windsum = windsum+arr[i];
            
        }
        if(windsum/k>=threshold){
                count++;
            }
        for(int i=k;i<arr.length;i++){
            windsum = windsum-arr[i-k]+arr[i];
            if(windsum/k>=threshold){
                count++;
            }

        }
        return count;
    }
}