public class Solution extends VersionControl {

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left < right) {

            // ye mid calculate karne ka way hai.
            // (left + right) / 2 se integer overflow ho sakta hai.
            int mid = left + (right - left) / 2;

            // Agar mid BAD hai,
            // toh first bad mid khud bhi ho sakta hai.
            // Isliye mid ko remove nahi karna or api function pr bhej dena 
            if (isBadVersion(mid)) {

                right = mid;

            } else {

                // Agar mid GOOD hai,
                // toh mid answer nahi ho sakta.
                // Isliye mid ko hata do.
                left = mid + 1;
            }
        }

        // Jab left == right,
        // wahi first bad version hai.
        return left;
    }
}