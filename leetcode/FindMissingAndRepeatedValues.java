package leetcode;

// import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// class Solution {
//       public int[] findMissingAndRepeatedValues(int[][] grid) {
//         int result[] = new int[2];
//         ArrayList<Integer> tempArrayList = new ArrayList<>();
//         for (int i = 1; i <= grid.length * grid.length; i++) {
//             tempArrayList.add(i);
//         }
//         // System.out.println(tempArrayList + " At the start");
//         for (int i = 0; i < grid.length; i++) {
//             for (int j = 0; j < grid.length; j++) {
//                 // System.out.println(grid[i][j]);
//                 // System.out.println(tempArrayList + "\n" + "---");
//                 if (tempArrayList.contains(grid[i][j])) {
//                     tempArrayList.remove(tempArrayList.indexOf(grid[i][j]));
//                     // System.out.println("------ " + tempArrayList + "\n" + "---");
//                 } else {
//                     result[0] = grid[i][j];
//                 }
//             }
//         }
//         result[1] = tempArrayList.get(0);
//         return result;
//     }
// }

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] v) {
        int n = v.length;
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // System.out.println(m.getOrDefault(v[i][j], 0)+1);
                m.put(v[i][j], m.getOrDefault(v[i][j], 0) + 1);
            }
        }

        int a = -1, b = -1;
        for (int i = 1; i <= n * n; i++) {
            var curValue = m.getOrDefault(i, 0);
            if (curValue == 2) {
                a = i;
            } else if (curValue == 0) {
                b = i;
            }
        }

        return new int[] { a, b };

        
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = { { 1, 3 }, { 2, 2 } };
        int[] result = solution.findMissingAndRepeatedValues(grid);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        // [[1,5,2],[8,4,3],[7,8,6]]
        grid = new int[][] { { 1, 5, 2 }, { 8, 4, 3 }, { 7, 8, 6 } };
        result = solution.findMissingAndRepeatedValues(grid);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}