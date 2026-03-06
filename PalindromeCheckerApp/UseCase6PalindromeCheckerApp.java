package PalindromeCheckerApp;
import java.util.*;
public class UseCase6PalindromeCheckerApp 
{
    public static void main(String[] args)
    {
        String text = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for(char c : text.toCharArray())
        {
            queue.add(c);
            stack.push(c);
        }

        Boolean isPalindrome = true;

        while(!queue.isEmpty())
        {
            if(queue.poll() != stack.pop())
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