// UC8: Linked List Based Palindrome Checker
package PalindromeCheckerApp;
import java.util.*;

public class UseCase8PalindromeCheckerApp
{
    public static void main(String[] args) 
    {
        String text = "madam";
        
        LinkedList<Character> linkedList = new LinkedList<>();

        for(char c : text.toCharArray())
        {
            linkedList.addLast(c);
        }

        Boolean isPalindrome = true;

        while(linkedList.size() > 1)
        {
            if(linkedList.removeFirst() != linkedList.removeLast())
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