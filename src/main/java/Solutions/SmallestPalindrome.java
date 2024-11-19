package Solutions;

/*
You are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it. In one operation, you can replace a character in s with another lowercase English letter.

Your task is to make s a palindrome with the minimum number of operations possible. If there are multiple palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.

A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.

Return the resulting palindrome string.
 */
public class SmallestPalindrome {
    
    public static void main(String[] args) {
        System.out.println(makeSmallestPalindrome("seven"));
    }
    
    public static String makeSmallestPalindrome(String s) {
        int left = 0;
        int rigth = s.length() - 1;
        int operations = 0;
        StringBuilder sb = new StringBuilder(s);
        while (left < rigth) {
            if (sb.charAt(left) != sb.charAt(rigth)) {
                if (sb.charAt(left) - sb.charAt(rigth) < 0)
                    sb.setCharAt(rigth, sb.charAt(left));
                else sb.setCharAt(left, sb.charAt(rigth));
            }
            left++;
            rigth--;
        }
        
        return sb.toString();
    }
    
}
