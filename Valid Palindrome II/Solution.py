class Solution:
    def validPalindrome(self, s: str) -> bool:
        lefIdx = 0
        rightIdx = len(s) - 1
        
        while (lefIdx < rightIdx):
            
            if (s[lefIdx] != s[rightIdx]):
                return s[lefIdx:rightIdx] == s[lefIdx:rightIdx][::-1] or s[lefIdx+1:rightIdx+1] == s[lefIdx+1:rightIdx+1][::-1]
            
            lefIdx += 1
            rightIdx -= 1
            
        return True
