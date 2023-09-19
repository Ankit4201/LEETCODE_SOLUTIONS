class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=1;
        int temp=num;
        if(num<=1)
          return false;
        for(int i=2;i*i<num;i++)
        {
            if(num%i==0)
              {
                  sum=sum+i;
                  if(num/i!=i)
                      sum=sum+num/i;
              }
        }
        if(sum==temp)
          return true;
        else
          return false;
        
    }
}