1class Solution {
2    public int findPeakElement(int[] nums) {
3        int low = 0;
4        int high = nums.length - 1;
5
6        while (low < high) {
7            int mid = low + (high - low) / 2;
8
9            if (nums[mid] > nums[mid + 1]) {
10                high = mid;
11            } else {
12                low = mid + 1;
13            }
14        }
15        return low;
16    }
17}