package PalindromeCheckerApp;
import java.util.*;

public class UseCase7PalindromeCheckerApp 
{
    public static void main(String[] args) 
    {
        String text = "madam";
        
        Deque<Character> deque = new ArrayDeque<>();

        for(char c : text.toCharArray())
        {
            deque.addLast(c);
        }

        Boolean isPalindrome = true;

        while(deque.size() > 1)
        {
            if(deque.removeFirst() != deque.removeLast())
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