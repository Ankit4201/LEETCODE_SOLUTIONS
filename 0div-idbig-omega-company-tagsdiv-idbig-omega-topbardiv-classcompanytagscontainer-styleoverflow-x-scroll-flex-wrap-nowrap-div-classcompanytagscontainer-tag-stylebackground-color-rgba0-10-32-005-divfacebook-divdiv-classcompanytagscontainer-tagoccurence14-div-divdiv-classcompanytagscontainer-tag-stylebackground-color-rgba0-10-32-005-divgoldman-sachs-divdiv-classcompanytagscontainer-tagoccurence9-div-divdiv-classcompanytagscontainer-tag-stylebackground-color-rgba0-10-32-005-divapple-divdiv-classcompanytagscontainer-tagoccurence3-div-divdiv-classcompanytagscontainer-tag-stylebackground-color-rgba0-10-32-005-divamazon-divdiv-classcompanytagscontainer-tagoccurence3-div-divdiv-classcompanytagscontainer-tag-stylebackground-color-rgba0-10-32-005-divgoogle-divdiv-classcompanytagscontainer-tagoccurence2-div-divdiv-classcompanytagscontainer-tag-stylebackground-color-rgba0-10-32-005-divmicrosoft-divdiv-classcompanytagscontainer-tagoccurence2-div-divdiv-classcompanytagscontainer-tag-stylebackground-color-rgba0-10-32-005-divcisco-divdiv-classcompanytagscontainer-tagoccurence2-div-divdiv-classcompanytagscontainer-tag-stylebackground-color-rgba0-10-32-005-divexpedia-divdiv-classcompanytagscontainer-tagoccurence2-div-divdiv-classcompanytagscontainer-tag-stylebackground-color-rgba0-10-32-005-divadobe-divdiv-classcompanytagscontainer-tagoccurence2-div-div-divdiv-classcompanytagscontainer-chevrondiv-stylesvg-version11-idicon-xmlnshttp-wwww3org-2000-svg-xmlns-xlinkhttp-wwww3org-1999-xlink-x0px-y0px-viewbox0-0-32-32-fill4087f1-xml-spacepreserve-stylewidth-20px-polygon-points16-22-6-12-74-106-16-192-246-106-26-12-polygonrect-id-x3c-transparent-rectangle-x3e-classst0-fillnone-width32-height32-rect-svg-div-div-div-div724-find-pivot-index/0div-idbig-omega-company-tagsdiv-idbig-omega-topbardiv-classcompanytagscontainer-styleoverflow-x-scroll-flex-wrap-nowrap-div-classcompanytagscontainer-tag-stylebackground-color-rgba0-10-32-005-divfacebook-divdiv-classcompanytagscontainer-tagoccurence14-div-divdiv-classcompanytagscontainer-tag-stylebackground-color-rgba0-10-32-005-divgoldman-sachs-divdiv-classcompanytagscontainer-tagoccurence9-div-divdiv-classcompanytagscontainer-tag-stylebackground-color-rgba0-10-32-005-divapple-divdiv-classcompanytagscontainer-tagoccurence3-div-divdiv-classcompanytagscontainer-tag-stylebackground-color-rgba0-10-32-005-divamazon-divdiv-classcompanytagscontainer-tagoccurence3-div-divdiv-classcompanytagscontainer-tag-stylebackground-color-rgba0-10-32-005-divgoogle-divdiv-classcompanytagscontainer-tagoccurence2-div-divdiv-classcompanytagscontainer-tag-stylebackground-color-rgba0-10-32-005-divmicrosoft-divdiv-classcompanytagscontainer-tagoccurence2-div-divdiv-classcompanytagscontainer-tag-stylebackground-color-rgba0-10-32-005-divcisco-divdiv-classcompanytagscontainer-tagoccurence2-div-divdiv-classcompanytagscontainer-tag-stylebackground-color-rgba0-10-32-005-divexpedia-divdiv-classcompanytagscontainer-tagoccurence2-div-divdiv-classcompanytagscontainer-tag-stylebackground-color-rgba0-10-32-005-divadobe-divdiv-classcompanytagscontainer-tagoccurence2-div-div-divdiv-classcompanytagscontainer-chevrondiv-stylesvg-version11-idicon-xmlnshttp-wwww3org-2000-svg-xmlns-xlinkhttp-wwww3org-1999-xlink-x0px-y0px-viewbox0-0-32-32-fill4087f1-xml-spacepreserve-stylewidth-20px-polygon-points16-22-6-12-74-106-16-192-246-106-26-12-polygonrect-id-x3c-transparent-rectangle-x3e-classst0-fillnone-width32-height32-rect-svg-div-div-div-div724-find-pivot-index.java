class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0,leftSum=0;
        int n=nums.length;
        if(n==0)
             return 0;
        for(int i=0; i<n; i++)
        {
            totalSum+=nums[i];
        }
        for(int i=0; i<n; i++)
        {
            int rightSum=totalSum-leftSum-nums[i];
            
            if(leftSum==rightSum)
                return i;
            
            leftSum+=nums[i];
        }
        return -1;
    }
}