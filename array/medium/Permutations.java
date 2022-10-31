package array.medium;

import java.util.*;

class Permutaions {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> rs = new ArrayList<>();
    List<Integer> comb = new ArrayList<>();
    int[] count = new int[nums.length];
    backtrack(nums, count, 0, rs, comb);
    return rs;

  }

  void backtrack(int[] nums, int[] count, int level, List<List<Integer>> rs, List<Integer> comb) {
    if (level == nums.length) {
      rs.add(new ArrayList(comb));
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (count[i] > 0)
        continue;
      count[i]++;
      comb.add(nums[i]);
      backtrack(nums, count, level + 1, rs, comb);
      count[i]--;
      comb.remove(comb.size() - 1);
    }
  }
}