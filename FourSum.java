// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class FourSum{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            // String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of Integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] A, int k) {
        // code here
        int l, r;
Arrays.sort(A);
int n=A.length;

Set<ArrayList<Integer>> set = new LinkedHashSet<>();

for (int i = 0; i < n - 3; i++)
{
for (int j = i + 1; j < n - 2; j++)
{

l = j + 1;
r = n - 1;
while (l < r)
{
if (A[i] + A[j] + A[l] + A[r] == k)
{
ArrayList<Integer> list =new ArrayList<Integer>();
list.add((A[i]));
list.add((A[j]));
list.add((A[l]));
list.add((A[r]));
l++;
r--;
set.add(list);
}
else if (A[i] + A[j] + A[l] + A[r] < k)
l++;
else
r--;
}

}

}
ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>(set);

return ans;
    }
}


