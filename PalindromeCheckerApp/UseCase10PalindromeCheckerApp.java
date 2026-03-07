// UC10: Case-Insensitive & Space-Ignored Palindrome
package PalindromeCheckerApp;
import java.util.*;

public class UseCase10PalindromeCheckerApp 
{
    public static void main(String[] args) 
    {
        String text = "MADAM";
        
        String normalized = text.toLowerCase().replace(" ", "");

        for(int i = 0; i < normalized.length() / 2; i++) 
        {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) 
            {
                System.out.println("Is it a Palindrome? : False");
                return;
            }
        }
        System.out.println("Is it a Palindrome? : True");
    }
}