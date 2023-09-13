class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int negativeCount=0;
        int positiveCount=0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]<0)
                negativeCount++;
            else if(nums[i]>0)
                positiveCount++;
        }
        if(negativeCount>positiveCount)
            return negativeCount;
        else
            return positiveCount;
    }
}