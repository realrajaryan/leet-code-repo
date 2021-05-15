class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        num = 0
        for i in range(len(digits)):
            num += digits[::-1][i] * (10**i)
    
        return (list(str(num+1)))
