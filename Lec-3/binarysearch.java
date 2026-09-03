// Binary Search hota kya hai?
// Binary Search ek searching technique hai jisme hum sorted array ke andar kisi 
// element ko efficiently find karte hain.
// Normal Linear Search mein ek-ek element check karte hain:
// 10 → 20 → 30 → 40 → 50 → 60
// hum middle element check karte hain aur har step mein array ka half part eliminate kar dete hain.
// Isliye iska time complexity:
// O(log n) hota hai 
// Array sorted hona chahiye.
// int[] arr = {10, 20, 30, 40, 50, 60, 70};

// leetcode 704-
class Solution {
    public int search(int[] nums, int target) {
        int shuru = 0;                 // bhai search yahi se start hogi
        int aakhir = nums.length - 1;  // aur yaha tak check karna hai

        while (shuru <= aakhir) {
            // Mid nikal rahe hain, direct (shuru + aakhir)/2 bhi kar sakte ho
            int beech = shuru + (aakhir - shuru) / 2;
            // pehle middle wale element ko target se compare karo
            if (nums[beech] == target) {
                return beech;
            }
            // Agar middle ka element target se chhota hai,
            // toh target right side mein hoga
            if (nums[beech] < target) {
                shuru = beech + 1;
            }
            // Agar middle bada hai,
            // toh target left side mein hoga
            else {
                aakhir = beech - 1;
            }
        }
        // Pura search kar liya, target mila hi nahi
        return -1;
    }
}


// aggressive cow discussion on board-