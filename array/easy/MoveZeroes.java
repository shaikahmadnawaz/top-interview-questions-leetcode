package array.easy;

public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 0) {
      return;
    }
    int insertPos = 0;
    // If it is non zero then we are adding to array
    for (int num : nums) {
      if (num != 0) {
        nums[insertPos++] = num;
      }
    }
    // We have to make sure that empty places are filled with 0's
    while (insertPos < nums.length) {
      nums[insertPos++] = 0;
    }
  }
}
