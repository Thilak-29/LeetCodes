class Solution {
    public int maxProduct(int n) {
         int max1 = 0;
         int max2 = 0;
         int num = n;
    while(num>0){
        int n1 = num%10;
        
        if(n1>max1){
            max2 = max1;
            max1=n1;

        }
        else{
            max2 = Math.max(max2,n1);
        }
        
        num/=10;
    }
        

        return(max1*max2);
    }
}