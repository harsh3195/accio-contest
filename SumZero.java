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

1 5 4 2 -3 1 6
Yes 

1 5 4 2 0 1 6
Yes

1 18 43 6 -39 -8 -21 23 -29 -31 34 -13 48 -26 -35 20 -37 -24 41 30

Yes

1 7 23 12 20 46 31 -45 -25

No

1 19 -21 -50 -4 38 47 -1 40 -47 -17 13 47 3 42 36 -25 2 46 25 38

No

