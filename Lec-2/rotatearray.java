class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        // Bhai agar k array ki length se bada hai,
        // toh extra rotations ka koi fayda nahi.
        // Example: n = 5, k = 7 => 7 % 5 = 2
        k = k % n;

        // Pura array reverse kar do
        // [1,2,3,4,5,6,7]
        // [7,6,5,4,3,2,1]
        reverse(nums, 0, n - 1);

        // First k elements reverse karo
        // [7,6,5 | 4,3,2,1]
        
        // [5,6,7 | 4,3,2,1]
        reverse(nums, 0, k - 1);

        // Baaki ke elements reverse karo
        // [5,6,7 | 4,3,2,1]       
        // [5,6,7 | 1,2,3,4]
        

        // Bas bhai, final rotated array mil gaya.
        reverse(nums, k, n - 1);
    }

    // Ye function array ke diye hue range ko reverse karta hai
    public void reverse(int[] nums, int start, int end) {

        while (start < end) {

            // Dono ends ke elements swap karenge
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Ab pointers ko andar le jao
            start++;
            end--;
        }
    }
}