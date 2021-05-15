class Solution {
    public int removeDuplicates(int[] nums) {
        int numsIndex = 0;
        if(nums.length == 0) {
            return numsIndex;
        }
        for(int i = 1; i < nums.length; i++) {
            if(nums[numsIndex] != nums[i]) {
                numsIndex += 1;
                nums[numsIndex] = nums[i];
            }
        }
        
        return numsIndex + 1;
    }
}
