package Solutions;

import org.example.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
 */
public class HappyNumber {
    
    public static void main(String[] args) {
        isHappy(2);
    }
    public static boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        
        while(n != 1){
            if (map.containsKey(n)){
                return false;
            }
            
            map.put(n,n);
            
            String[] x = String.valueOf(n).split("");
            int tmp = 0;
            for (String s : x) { // prendo ogni carattere splittato
                int value = Integer.parseInt(s);
                double pow = value*value;
                tmp += (int) pow;
            }
            n = tmp;
        }
        return true;
    }
}
