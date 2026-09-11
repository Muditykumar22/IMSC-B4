class Solution {
    // Ye function check karega ki string palindrome hai ya nahi
    public boolean palindromeCheck(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // Ye function saare possible substrings banayega
    public int substringBanao(String s) {
        int count = 0;
        for (int start = 0; start < s.length(); start++) {
            for (int end = start; end < s.length(); end++) {
                // substring bana rahe hain
                String chhotaString = s.substring(start, end + 1);
                // Check kar rahe hain palindrome hai ya nahi
                if (palindromeCheck(chhotaString)) {
                    count++;
                }
            }
        }
        return count;
    }
    // LeetCode ka main function
    public int countSubstrings(String s) {
        return substringBanao(s);
    }
}