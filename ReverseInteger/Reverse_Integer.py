class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        num_str = str(abs(x))
        int_reversed = int(num_str[::-1])
        
        if int_reversed > 2147483647: 
            # check 32-bit signed integer range
            return 0
        if x > 0:
            return int_reversed
        else:
            return int_reversed * -1
