//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        }
        
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   
    
    public static int findSum(int A[],int N) 
    {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        if(N<=1){
            return 2*A[0];
        }
        
        if(A[0]>A[1]) {
            max = A[0];
            min = A[1];
        } else {
            max = A[1];
            min = A[0];
        }
        
        for(int i=2; i<N; i++) {
            if(A[i] > max) {
                max = A[i];
            }else if(A[i]<min){
                min = A[i];
            }
        }
        return max+min;
    }
}
