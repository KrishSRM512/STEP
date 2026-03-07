// UC9: Recursive Palindrome Checker
package PalindromeCheckerApp;
import java.util.*;

public class UseCase9PalindromeCheckerApp 
{
    public static void main(String[] args) 
    {
        String text = "madam";
        
        if (isPalindrome(text, 0, text.length() - 1)) 
        {
            System.out.println("Is it a Palindrome? : True");
        }
        else
        {
            System.out.println("Is it a Palindrome? : False");
        }
    }
    
    public static boolean isPalindrome(String text, int start, int end) 
    {
        if (start >= end) 
        {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) 
        {
            return false;
        }
        return isPalindrome(text, start + 1, end - 1);
    }
}