import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> jawab = new ArrayList<>();

        int upar = 0;
        int neeche = matrix.length - 1;

        int left = 0;
        int right = matrix[0].length - 1;

        // Jab tak valid boundary hai tab tak andar jaana hai
        while (upar <= neeche && left <= right) {

            // 1. Pehle TOP row ko left -> right traverse karo
            for (int j = left; j <= right; j++) {
                jawab.add(matrix[upar][j]);
            }

            // Top row complete ho gayi
            upar++;

            // 2. Ab RIGHT column ko top -> bottom traverse karo
            for (int i = upar; i <= neeche; i++) {
                jawab.add(matrix[i][right]);
            }

            // Right column complete
            right--;

            // kya ab bottom row exist karti bhi hai?
            if (upar <= neeche) {

                // 3. Bottom row ko right -> left traverse karo
                for (int j = right; j >= left; j--) {
                    jawab.add(matrix[neeche][j]);
                }

                // Bottom row complete
                neeche--;
            }

            // Ab check karna zaroori hai ki left column bacha hai ya nahi
            if (left <= right) {

                // 4. LEFT column ko bottom -> top traverse karo
                for (int i = neeche; i >= upar; i--) {
                    jawab.add(matrix[i][left]);
                }

                // Left column complete
                left++;
            }
        }

        return jawab;
    }
}