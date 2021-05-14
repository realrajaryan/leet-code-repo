public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    int[] arrToReturn = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if ((i != j) && (nums[i] + nums[j] == target)) {
          arrToReturn[0] = i;
          arrToReturn[1] = j;
          return arrToReturn;
        }
      }
    }
    return arrToReturn;
  }
}
