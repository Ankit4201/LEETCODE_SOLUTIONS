class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int n=nums.length;
        int end=n-1;
        int start=0;
        int sum=0;
        int max=0;
        while(start<=end)
        {
            sum=nums[start]+nums[end];
            max=Math.max(max,sum);
            start++;end--;
        }
        return max;
        
    }
}