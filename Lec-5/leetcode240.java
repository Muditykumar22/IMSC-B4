class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Top-right corner se start kar rahe hain
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {

            int current = matrix[row][col];

            // Target mil gaya
            if (current == target) {
                return true;
            }

            // Current bada hai,
            // toh left jaana padega
            else if (current > target) {
                col--;
            }

            // Current chhota hai,
            // toh neeche jaana padega
            else {
                row++;
            }
        }

        return false;
    }
}