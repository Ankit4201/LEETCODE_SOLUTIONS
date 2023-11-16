class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(arr);
        int min= Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length-1; i++)
        {
            int difference = arr[i+1] - arr[i];
            if(difference < min)
            {
                min=difference;
                res.clear();
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
            else if(difference==min)
            {
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
    }
}