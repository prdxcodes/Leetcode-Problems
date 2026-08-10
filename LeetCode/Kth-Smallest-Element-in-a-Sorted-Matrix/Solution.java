1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n = matrix.length;
4
5        int low = matrix[0][0];
6        int high = matrix[n - 1][n - 1];
7
8        while (low < high) {
9            int mid = low + (high - low) / 2;
10
11            int count = countLessOrEqual(matrix, mid);
12
13            if (count < k) {
14                low = mid + 1;
15            } else {
16                high = mid;
17            }
18        }
19
20        return low;
21    }
22    private int countLessOrEqual(int[][] matrix, int target) {
23        int n = matrix.length;
24        int row = n - 1;
25        int col = 0;
26        int count = 0;
27
28        while (row >= 0 && col < n) {
29            if (matrix[row][col] <= target) {
30                count += row + 1;
31                col++;
32            } else {
33                row--;
34            }
35        }
36
37        return count;
38    }
39}