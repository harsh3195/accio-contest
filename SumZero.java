/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class SumZero {
private static boolean isSubarrayZeroSum(int[] nums, int n) {
Set<Integer> numSet = new HashSet<>();
int preSum = 0;
int i = 0;
while(i < n) {
preSum += nums[i];

if(preSum == 0 || numSet.contains(preSum))
return true;
numSet.add(preSum);
i++;
}
return false;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int nTestCases = scanner.nextInt();

while(nTestCases-- > 0) {
int n = scanner.nextInt();
int[] nums = new int[n];
for(int i = 0; i < n; i++) {
nums[i] = scanner.nextInt();
}
boolean hasZeroSum = isSubarrayZeroSum(nums, n);
System.out.println(hasZeroSum ? "Yes": "No");
}

scanner.close();
}
}