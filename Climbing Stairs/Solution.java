class Solution {
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int nMinusOneStair = 2;
        int nMinusTwoStair = 1; 
        
        for (int i = 3; i < n; ++i) {
            int tempVar = nMinusOneStair;
            nMinusOneStair += nMinusTwoStair;
            nMinusTwoStair = tempVar;
        }
        
        return (nMinusOneStair + nMinusTwoStair);
    }
}
