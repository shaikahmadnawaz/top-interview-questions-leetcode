package array.easy;

import java.util.*;

public class MissingNumber {
  public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int left = 0, right = nums.length, mid = (left + right) / 2;
    while (left < right) {
      mid = (left + right) / 2;
      if (nums[mid] > mid)
        right = mid;
      else
        left = mid + 1;
    }
    return left;
  }
}

class Solution {
  public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i) {
        return i;
      }
    }
    return nums.length;
  }
}
