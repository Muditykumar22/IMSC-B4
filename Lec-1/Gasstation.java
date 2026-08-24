class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int puritanki = 0;
        int tank = 0;
        int shuruwat = 0;

        for (int i = 0; i < gas.length; i++) {

            int gain = gas[i] - cost[i];

            puritanki += gain;
            tank += gain;

            if (tank < 0) {
                shuruwat = i + 1;
                tank = 0;
            }
        }

        return puritanki >= 0 ? shuruwat : -1;
    }
}
//https://leetcode.com/problems/product-of-array-except-self/- assignment
//https://leetcode.com/problems/maximum-sum-circular-subarray/ learn about the algo
