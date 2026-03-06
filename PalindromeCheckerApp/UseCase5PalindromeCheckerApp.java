package PalindromeCheckerApp;
import java.util.*;

public class UseCase5PalindromeCheckerApp 
{
    public static void main(String[] args)
    {
        String text = "madam";
        
        Stack<Character> stack = new Stack<>();

        for(char c : text.toCharArray())
        {
            stack.push(c);
        }
        Boolean isPalindrome = true;
        
        for(char c : text.toCharArray())
        {
            if(stack.pop() != c)
            {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
        {
            System.out.println("Is it a Palindrome? : True");
        }
        else
        {
            System.out.println("Is it a Palindrome? : False");
        }
    }    
}