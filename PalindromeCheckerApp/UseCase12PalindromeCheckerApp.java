// UC12: Strategy Pattern for Palindrome Algorithms (Advanced)
package PalindromeCheckerApp;
import java.util.*;

interface PalindromeAlgorithm 
{
    boolean isPalindrome(String text);
}

class StackBasedPalindrome implements PalindromeAlgorithm 
{
    @Override
    public boolean isPalindrome(String text) 
    {
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) 
        {
            stack.push(c);
        }

        for (char c : text.toCharArray()) 
        {
            if (stack.pop() != c) 
            {
                return false;
            }
        }

        return true;
    }
}

public class UseCase12PalindromeCheckerApp
{
    public static void main(String[] args) 
    {
        String text = "madam";
        
        StackBasedPalindrome stackBasedPalindrome = new StackBasedPalindrome();
        
        if (stackBasedPalindrome.isPalindrome(text)) 
        {
            System.out.println("Is it a Palindrome? : True");
        }
        else
        {
            System.out.println("Is it a Palindrome? : False");
        }
    }
}