class Solution {
    public int maxProductDifference(int[] nums) {
        
        Arrays.sort(nums);
        
        int minProduct = nums[0] * nums[1];
        int maxProduct = nums[nums.length-1] * nums[nums.length-2];
        
        int difference = maxProduct-minProduct;
        return difference;
        
    }
}