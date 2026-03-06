package PalindromeCheckerApp;

public class UseCase3PalindromeCheckerApp 
{
    public static void main(String[] args)
    {
        String text = "madam";
        String reversedText = "";
        for(int i = text.length() - 1; i >= 0; i--)
        {
            reversedText = reversedText + text.charAt(i);
        }

        if (text.equals(reversedText))
        {
            System.out.println("Is it a Palindrome? : True");
        }
        else
        {
            System.out.println("Is it a Palindrome? : False");
        }
    }    
}