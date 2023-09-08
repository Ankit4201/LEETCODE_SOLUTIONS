import java.lang.Math;
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,sum2=0;
        
        for(int i=0; i<nums.length; i++)
        {
            sum=sum+nums[i];
            
            int x=nums[i];
            int rem;
            while(x>0)
            {
                 rem = x%10;
                 sum2=sum2+rem;
                 x=x/10;
            }
        }
        return (sum-sum2);
        
       
        
    }
}