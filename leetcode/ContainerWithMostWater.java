package leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        if (n == 0)
            return 0;
        int i = 0, j = n - 1, max = 0;
        while (i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            if (area > max)
                max = area;
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater sol = new ContainerWithMostWater();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(sol.maxArea(height));
    }
}
