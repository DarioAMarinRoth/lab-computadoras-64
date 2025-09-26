package soluciones;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int currentArea;
        int maxArea = 0;
        int n = height.length;

        int i = 0;
        int d = n - 1;


        while (i != d) {
            currentArea = getArea(i, f, height);
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            if (height[i] < height[d]) {
                i++;
            } else {
                d--;
            }
        }
        return maxArea;
    }

    public static int getArea(int i, int f, int[] heights) {
        int base = Math.abs(i - f);
        int height = Math.min(heights[i], heights[f]);
        return base * height;
    }
}
