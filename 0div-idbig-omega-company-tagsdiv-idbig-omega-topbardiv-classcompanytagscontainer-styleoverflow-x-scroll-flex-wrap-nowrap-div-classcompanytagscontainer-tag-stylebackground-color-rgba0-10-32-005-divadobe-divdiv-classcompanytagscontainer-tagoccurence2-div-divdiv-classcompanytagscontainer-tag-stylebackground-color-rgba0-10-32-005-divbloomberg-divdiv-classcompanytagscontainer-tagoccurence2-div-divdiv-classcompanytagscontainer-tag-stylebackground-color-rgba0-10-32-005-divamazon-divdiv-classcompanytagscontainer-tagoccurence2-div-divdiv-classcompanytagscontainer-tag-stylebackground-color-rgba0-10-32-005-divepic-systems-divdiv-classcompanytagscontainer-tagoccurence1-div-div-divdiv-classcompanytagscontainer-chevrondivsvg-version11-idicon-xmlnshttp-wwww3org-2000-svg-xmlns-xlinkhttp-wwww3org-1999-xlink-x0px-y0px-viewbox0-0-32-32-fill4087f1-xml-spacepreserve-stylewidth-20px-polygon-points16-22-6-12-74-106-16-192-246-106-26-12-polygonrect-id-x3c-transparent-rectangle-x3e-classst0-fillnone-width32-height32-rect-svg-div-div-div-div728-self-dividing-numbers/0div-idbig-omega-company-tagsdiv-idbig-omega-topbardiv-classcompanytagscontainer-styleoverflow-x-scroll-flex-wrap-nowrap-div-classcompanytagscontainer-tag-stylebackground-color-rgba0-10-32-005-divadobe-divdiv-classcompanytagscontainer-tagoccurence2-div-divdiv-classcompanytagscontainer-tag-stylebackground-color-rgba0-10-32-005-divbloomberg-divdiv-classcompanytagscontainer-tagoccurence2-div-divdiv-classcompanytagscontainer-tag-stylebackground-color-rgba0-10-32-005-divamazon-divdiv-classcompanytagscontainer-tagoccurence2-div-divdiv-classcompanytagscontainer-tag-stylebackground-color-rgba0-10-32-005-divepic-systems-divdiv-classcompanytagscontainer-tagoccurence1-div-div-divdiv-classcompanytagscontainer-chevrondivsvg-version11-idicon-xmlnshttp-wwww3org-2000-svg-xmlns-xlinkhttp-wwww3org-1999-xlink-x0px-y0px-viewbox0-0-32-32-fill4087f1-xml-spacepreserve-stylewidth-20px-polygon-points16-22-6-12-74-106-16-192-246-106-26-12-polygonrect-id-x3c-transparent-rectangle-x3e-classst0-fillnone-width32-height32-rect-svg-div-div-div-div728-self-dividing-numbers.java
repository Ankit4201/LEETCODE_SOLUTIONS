class Solution {
    
    public boolean selfDivide(int actualNo)
    {
        int num=actualNo;
        while(num>0)
        {
            int rem=num%10;
            if(rem==0)
                 return false;
            if(actualNo % rem != 0)
                return false;
            num=num/10;
            
        }
        return true;
    }
    
    
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=left; i<=right; i++)
        {
            if(selfDivide(i))
                answer.add(i);
        }
        return answer;
        
    }
}