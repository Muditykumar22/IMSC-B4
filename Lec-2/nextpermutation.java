class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;


        // Right se pehla aisa element dhundo
        // jiske liye nums[i] < nums[i + 1]
        //
        // Ye hamara pivot hoga.
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Agar i >= 0 hai, matlab pivot mila hai.
        //
        // Agar i = -1 hua, matlab pura array descending hai.
        // Example: [8,7,4]
        // Iska next permutation simply [4,7,8] hoga.
        if (i >= 0) {


            // Right se pivot se just greater element dhundo.
            int j = n - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            // Pivot aur just greater element ko swap karo.
            swap(nums, i, j);
        }

        // Pivot ke right side ko reverse karo.
        //
        // i + 1 se start isliye kar rahe hain
        // kyunki pivot ko already correct position par laga diya hai.
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}

