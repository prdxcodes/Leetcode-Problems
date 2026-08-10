1class Solution {
2    public int[] plusOne(int[] digits) {
3        for (int i = digits.length - 1; i >= 0; i--) {
4
5            if (digits[i] < 9) {
6                digits[i]++; 
7                return digits;
8            }
9            digits[i] = 0;
10        }
11        int[] result = new int[digits.length + 1];
12        result[0] = 1;
13
14        return result;
15    }
16}