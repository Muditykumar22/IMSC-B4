class Solution {
    public int trap(int[] height) {

        int x = height.length;
        int totalWater = 0;

        for (int i = 0; i < x; i++) {

            int leftMax = 0;
            int rightMax = 0;

            // sbse bada dhundhna left side se 
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // yaha pr right side se dhundhna hai
            for (int j = i; j < x; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            int water = Math.min(leftMax, rightMax) - height[i];
            // ab paani store krna hai 
            totalWater += gaddha;
        }

        return totalWater;
    }
}

//https://leetcode.com/problems/product-of-array-except-self/- assignment
//https://leetcode.com/problems/maximum-sum-circular-subarray/ learn about the algo
