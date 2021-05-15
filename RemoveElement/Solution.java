class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) {
            return 0;
        }
        
        int i = 0;
        for(int num : nums) {
            if(num != val){
                nums[i] = num;
                i += 1;
            }
        }
        
        return i;
    }
}
