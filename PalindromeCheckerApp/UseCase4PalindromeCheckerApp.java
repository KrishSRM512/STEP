package PalindromeCheckerApp;

public class UseCase4PalindromeCheckerApp 
{
    public static void main(String[] args) 
    {
        String text = "madam";
        
        char[] chars = text.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) 
        {
            if (chars[start] != chars[end]) 
            {
                System.out.println("Is it a Palindrome? : False");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Is it a Palindrome? : True");
    }
}