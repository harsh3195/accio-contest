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
static boolean isPossible(int arr[], int n, int m, int curr_min) 
    { 
        int studentsRequired = 1; 
        int curr_sum = 0; 
       
        // iterate over all books 
        for (int i = 0; i < n; i++) 
        { 
            // check if current number of pages are greater 
            // than curr_min that means we will get the result 
            // after mid no. of pages 
            if (arr[i] > curr_min) 
                return false; 
       
            // count how many students are required 
            // to distribute curr_min pages 
            if (curr_sum + arr[i] > curr_min) 
            { 
                // increment student count 
                studentsRequired++; 
       
                // update curr_sum 
                curr_sum = arr[i]; 
       
                // if students required becomes greater 
                // than given no. of students,return false 
                if (studentsRequired > m) 
                    return false; 
            } 
       
            // else update curr_sum 
            else
                curr_sum += arr[i]; 
        } 
        return true; 
    } 
public static int findPages(int[]arr,int n,int m)
{
    //Your code here
    
}

// { Driver Code Starts.

}  // } Driver Code Ends