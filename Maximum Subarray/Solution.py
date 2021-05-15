class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxSum = [nums[0]]
        for i in range(1, len(nums)):
             maxSum.append(max((nums[i] + maxSum[i-1]), nums[i]))
            
        return max(maxSum)
