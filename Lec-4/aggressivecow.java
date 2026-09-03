import java.util.*;

class aggressivecow {

    // Ye function check karega ki given distance pe
    // saari cows ko place kar pa rahe hain ya nahi
    static boolean cowRakhSakteHai(int[] stalls, int cows, int distance) {
        // Pehli cow ko sabse pehle stall pe rakh diya
        int pichhliCow = stalls[0];
        // Ek cow already place ho gayi
        int cowCount = 1;
        for (int i = 1; i < stalls.length; i++) {
            // Current stall aur last cow ke beech ka gap
            int gap = stalls[i] - pichhliCow;
            // Agar required minimum distance mil raha hai
            // toh yaha next cow rakh denge
            if (gap >= distance) {
                cowCount++;
                pichhliCow = stalls[i];
            }
            // Required cows place ho gayi
            if (cowCount == cows) {
                return true;
            }
        }
        // Itni cows place nahi ho paayi
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int stallsKiGinti = sc.nextInt();
            int cowsKiGinti = sc.nextInt();
            int[] stalls = new int[stallsKiGinti];
            for (int i = 0; i < stallsKiGinti; i++) {
                stalls[i] = sc.nextInt();
            }
            // Bhai sabse pehle stalls sort karna zaroori hai
            Arrays.sort(stalls);
            // Minimum possible distance
            int shuru = 1;

            // Maximum possible distance
            int aakhir = stalls[stallsKiGinti - 1] - stalls[0];
            int jawab = 0;
            while (shuru <= aakhir) {

                // Middle distance ko try karenge
                int beech = shuru + (aakhir - shuru) / 2;
                // Check karte hain ki beech wali distance possible hai ya nahi
                if (cowRakhSakteHai(stalls, cowsKiGinti, beech)) {


                    // Agar possible hai toh answer save karo
                    jawab = beech;
                    // Ab aur bada distance try karenge
                    shuru = beech + 1;

                } else {


                    // Agar possible nahi hai toh chhota distance try karo
                    aakhir = beech - 1;
                }
            }

            System.out.println(jawab);
        }

        sc.close();
    }
}