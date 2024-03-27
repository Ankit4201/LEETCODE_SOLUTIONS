class Solution {
    public int[] numberGame(int[] nums) {
       Arrays.sort(nums);
      
        int []num = nums.clone();
        for(int i=0; i<num.length; i=i+2){
            int temp = num[i];
            num[i] = num[i+1];
            num[i+1] = temp;
        }
        return num;
      
        
    }
}