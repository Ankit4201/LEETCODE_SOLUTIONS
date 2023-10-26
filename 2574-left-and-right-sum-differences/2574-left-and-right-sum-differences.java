class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int n = nums.length;
           int leftSum[] = new int[n];
           int rightSum[]= new int[n];
           int []answer = new int[n];
           int sum =0;
           int sum2 =0;
           for(int i=0; i<n-1; i++)
           {
        	   leftSum[0]=0;
        	 sum = leftSum[i]+nums[i];
        	 leftSum[i+1]=sum;
           }
           rightSum[n-1]=0;
           for(int i=n-2; i>=0; i--)
           {
        	  sum2 = rightSum[i+1] + nums[i+1];
        	 rightSum[i]=sum2;
           }
           for(int i =0; i<n; i++)
           {
        	   answer[i]=Math.abs(leftSum[i]-rightSum[i]);
           }
           return answer;
        
        
    }
}