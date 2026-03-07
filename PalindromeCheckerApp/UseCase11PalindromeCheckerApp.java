// UC11: Object-Oriented Palindrome Service
package PalindromeCheckerApp;
import java.util.*;


class PalindromeService
{
    public boolean isPalindrome(String text)
    {
        int start = 0;
        int end = text.length() - 1;
        while (start < end)
        {
            if (text.charAt(start) != text.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
public class UseCase11PalindromeCheckerApp
{
    public static void main(String[] args) 
    {
        String text = "madam";
        
        PalindromeService palindromeService = new PalindromeService();
        
        if (palindromeService.isPalindrome(text)) 
        {
            System.out.println("Is it a Palindrome? : True");
        }
        else
        {
            System.out.println("Is it a Palindrome? : False");
        }
    }
}