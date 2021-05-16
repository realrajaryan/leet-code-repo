class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            if (height[left] < height[right]) {

                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    totalWater += leftMax - height[left];
                }

                left += 1;
            } else {

                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    totalWater += rightMax - height[right];
                }

                right -= 1;
            }
        }

        return totalWater;
    }
}
