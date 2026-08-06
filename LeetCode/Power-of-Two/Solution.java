1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if (n <= 0) {
4            return false;
5        }
6
7        return (n & (n - 1)) == 0;
8    }
9}