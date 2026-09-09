class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int upar = 0;
        int neeche = matrix.length - 1;

        int left = 0;
        int right = matrix[0].length - 1;

        while (upar <= neeche && left <= right) {

            // Left se Right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[upar][i]);
            }
            upar++;

            // Top se Bottom
            for (int i = upar; i <= neeche; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // Right se Left
            if (upar <= neeche) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[neeche][i]);
                }
                neeche--;
            }

            // Bottom se Top
            if (left <= right) {
                for (int i = neeche; i >= upar; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}