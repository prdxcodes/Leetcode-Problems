1class Solution {
2    public String intToRoman(int num) {
3
4        int[] values = {
5            1000, 900, 500, 400,
6            100, 90, 50, 40,
7            10, 9, 5, 4, 1
8        };
9
10        String[] romans = {
11            "M", "CM", "D", "CD",
12            "C", "XC", "L", "XL",
13            "X", "IX", "V", "IV", "I"
14        };
15
16        StringBuilder ans = new StringBuilder();
17
18        for (int i = 0; i < values.length; i++) {
19
20            while (num >= values[i]) {
21                ans.append(romans[i]);
22                num -= values[i];
23            }
24        }
25
26        return ans.toString();
27    }
28}