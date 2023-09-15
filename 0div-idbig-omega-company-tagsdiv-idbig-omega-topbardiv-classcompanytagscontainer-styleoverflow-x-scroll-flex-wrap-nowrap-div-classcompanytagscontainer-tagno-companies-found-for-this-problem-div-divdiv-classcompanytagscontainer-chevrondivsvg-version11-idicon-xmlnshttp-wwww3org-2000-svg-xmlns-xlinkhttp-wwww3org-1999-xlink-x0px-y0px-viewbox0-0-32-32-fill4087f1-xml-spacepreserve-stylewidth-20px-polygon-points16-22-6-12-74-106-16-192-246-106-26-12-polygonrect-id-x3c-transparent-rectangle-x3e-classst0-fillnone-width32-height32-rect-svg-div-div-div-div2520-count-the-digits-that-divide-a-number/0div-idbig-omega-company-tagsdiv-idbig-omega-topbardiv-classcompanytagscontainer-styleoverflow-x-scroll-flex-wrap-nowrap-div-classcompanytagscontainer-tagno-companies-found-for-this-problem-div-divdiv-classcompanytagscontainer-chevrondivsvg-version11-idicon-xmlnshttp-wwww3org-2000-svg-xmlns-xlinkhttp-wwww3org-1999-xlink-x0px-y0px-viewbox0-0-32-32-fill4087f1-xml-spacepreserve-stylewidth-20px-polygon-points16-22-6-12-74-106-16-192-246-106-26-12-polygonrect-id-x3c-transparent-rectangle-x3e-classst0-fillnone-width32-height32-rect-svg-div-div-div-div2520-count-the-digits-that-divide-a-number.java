class Solution {
    public int countDigits(int num) {
        int r=1,count=0;
        int temp=num;
        while(num>0)
        {
            r=num%10;
            if(temp%r==0)
                count++;
            num=num/10;
        }
        return count;
    }
}