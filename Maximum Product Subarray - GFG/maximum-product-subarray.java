//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        
        long  maxProduct=arr[0];
        long  minProduct=arr[0];
        long  ans = arr[0];
        
        for(int i=1; i<n; i++)
        {
            if(arr[i]<0)
            {
                long temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            maxProduct = Math.max((long)arr[i], arr[i]*maxProduct);
            minProduct = Math.min((long)arr[i], arr[i]*minProduct);
            
            ans=Math.max(ans,maxProduct);
        }
        return ans;
    }
}