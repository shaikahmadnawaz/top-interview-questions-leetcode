package array.easy;

import java.util.*;

/* 
 * Approach 1: Just using two for loops and iterating till end
 * TC - O(n^2)
 * SC - O(n)
 */
// 
public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    int n = nums.length;
    // i != j
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] { -1, -1 };
  }
}

/*
 * Approach - 2: Sorting and Two-Pointers technique.
 * 
 * Time Complexity: Depends on what sorting algorithm we use.
 * If Merge Sort or Heap Sort is used then (-)(nlogn) in the worst case.
 * If Quick Sort is used then O(n^2) in the worst case.
 * Auxiliary Space: This too depends on sorting algorithm. The auxiliary space
 * is O(n) for merge sort and O(1) for Heap Sort.
 */

/*
 * the array must be sorted. Once the array is sorted the two pointers can be
 * taken which mark the beginning and end of the array respectively. If the sum
 * is greater than the sum of those two elements, shift the right pointer to
 * decrease the value of the required sum and if the sum is lesser than the
 * required value, shift the left pointer to increase the value of the required
 * sum.
 */

class Solution {
  boolean hasArrayTwoCandidates(int arr[], int n, int x) {
    // code here
    Arrays.sort(arr);
    int l = 0;
    int r = arr.length - 1;
    while (l < r) {
      if (arr[l] + arr[r] == x) {
        return true;
      } else if (arr[l] + arr[r] < x) {
        l++;
      } else {
        r--;
      }
    }
    return false;
  }
}

/*
 * Approach - 3: Hashing
 * TC - O(n)
 * SC - O(n)
 */
// Refer note book once
class Hashing {
  public int[] twoSum(int[] numbers, int target) {
    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
      // We are subtracting contents in arr with target adding into hash map that arr
      // value and index if it is already not present in HashMap
      Integer diff = (Integer) (target - numbers[i]);
      // If it present in hashmap return that diff value and i
      if (hash.containsKey(diff)) {
        int toReturn[] = { hash.get(diff), i };
        return toReturn;
      }
      hash.put(numbers[i], i);
    }
    return null;
  }
}