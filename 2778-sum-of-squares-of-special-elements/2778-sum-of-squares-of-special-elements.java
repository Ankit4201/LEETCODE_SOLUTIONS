class Solution {
    public int sumOfSquares(int[] nums) {
        
        int n=nums.length;
        // return n;
        int sum=0,square=1;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
               int index = i-1; 
               square=nums[index]*nums[index];
               sum=sum+square;
            }
        }
        return sum;
    }
}