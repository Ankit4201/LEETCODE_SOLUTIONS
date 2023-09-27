class Solution {
    public int heightChecker(int[] heights) {
        
        int n=heights.length;
        int [] newHeights = new int[n];
        for(int i=0; i<n; i++)
        {
            newHeights[i]=heights[i];
        }
        Arrays.sort(heights);
        int count=0;
        for(int i=0; i<n; i++)
        {
            if(heights[i]!=newHeights[i])
                count++;
        }
        return count;    
        
    }
}