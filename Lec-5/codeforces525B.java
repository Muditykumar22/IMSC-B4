
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = str.length();

        int q = sc.nextInt();

        int[] effect = new int[n + 1];

        // Saare operations mark karenge
        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();

            int left = x - 1;
            int right = n - x;

            effect[left]++;
            effect[right + 1]--;
        }

        char[] chars = str.toCharArray();

        int chalRaha = 0;

        for (int i = 0; i < n / 2; i++) {

            chalRaha += effect[i];

            // Odd operation hua hai toh swap
            if (chalRaha % 2 == 1) {

                int doosra = n - i - 1;

                char temp = chars[i];
                chars[i] = chars[doosra];
                chars[doosra] = temp;
            }
        }

        System.out.println(new String(chars));
    }
}