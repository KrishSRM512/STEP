// UC13: Performance Comparison
package PalindromeCheckerApp;
import java.util.*;

public class UseCase13PalindromeCheckerApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        PalindromeChecker checker = new PalindromeChecker();
        long startTime = System.nanoTime();
        boolean isPalindrome = checker.isPalindrome(input);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Is '" + input + "' a palindrome? " + isPalindrome);
        System.out.println("Execution time: " + executionTime + " nanoseconds");
        sc.close();
    }
}

class PalindromeChecker 
{
    public boolean isPalindrome(String input) 
    {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) 
        {
            if (input.charAt(i) != input.charAt(length - 1 - i)) 
            {
                return false;
            }
        }
        return true;
    }
}