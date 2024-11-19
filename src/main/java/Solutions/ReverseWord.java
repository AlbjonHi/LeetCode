package Solutions;

import java.util.ArrayList;
import java.util.List;

/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 */
public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    
    public static String reverseWords(String s) {
        
        List<String> sList = new ArrayList<>(List.of(s.split(" ")));
        List<String> reversedWords = new ArrayList<>(sList.size());
        StringBuilder ret = new StringBuilder();
        for (String word : sList) {
            StringBuilder tmp = new StringBuilder();
            reversedWords.add(String.valueOf(tmp.append(word).reverse()));
        }
        for (String f : reversedWords) {
            ret.append(f).append(" ");
        }
        ret.deleteCharAt(ret.lastIndexOf(" "));
        return ret.toString();
    }
    
}
