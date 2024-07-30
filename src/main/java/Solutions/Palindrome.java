package Solutions;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int checkPalindrome=0,tmp=x;
        while(x>0){
            checkPalindrome=(checkPalindrome*10)+(x%10);
            x=x/10;
        }
        if(checkPalindrome==tmp)
            return true;
        return false;
    }
}
