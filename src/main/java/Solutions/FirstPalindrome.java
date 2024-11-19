package Solutions;

/*
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.
 */
public class FirstPalindrome {
    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));
    }
    
    public static String firstPalindrome(String[] words) {
        String palindrome = "";
        
        for (String s : words) {
            if (isPalindrome(s))
                return s;
        }
        
        return palindrome;
    }
    
    public static boolean isPalindrome(String word) {
        StringBuilder checkPalindromeWord = new StringBuilder();
        for (Character c : word.toCharArray()) {
            checkPalindromeWord.append(c);
        }
        return checkPalindromeWord.reverse().toString().equals(word);
    }
}
