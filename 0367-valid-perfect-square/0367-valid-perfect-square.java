class Solution {
    public boolean isPerfectSquare(int num) {
       
        double sq=Math.sqrt(num);
        int n=(int)sq;
        int z=n*n;
        if(z==num)
            return true;
        else
            return false;
        
    }
}