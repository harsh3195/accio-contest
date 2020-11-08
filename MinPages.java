// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class MinPages {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    System.out.println(findPages(a,n,m));
		}
	}
	
    
 // } Driver Code Ends


//User function Template for Java


public static int findPages(int[]arr,int n,int m)
{
    //Your code here
    
}

// { Driver Code Starts.

}  // } Driver Code Ends