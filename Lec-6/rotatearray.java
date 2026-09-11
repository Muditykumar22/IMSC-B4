class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        //Agar k array ke size se bada hai
        k = k % n;
        //Pehle pura array reverse
        reverseKaro(nums, 0, n - 1);

        //Ab first k elements reverse
        reverseKaro(nums, 0, k - 1);
        //Ab baaki elements reverse
        reverseKaro(nums, k, n - 1);
    }
    //Array ke given part ko reverse karega
    public void reverseKaro(int[] nums, int left, int right) {
        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}