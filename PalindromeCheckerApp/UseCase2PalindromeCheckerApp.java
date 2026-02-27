package PalindromeCheckerApp;
public class UseCase2PalindromeCheckerApp 
{
    public static void main(String[] args) 
    {
        String text = "madam";

        for(int i = 0; i < text.length() / 2; i++) 
        {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) 
            {
                System.out.println("Is it a Palindrome? : False");
                return;
            }
        }
        System.out.println("Is it a Palindrome? : True");
    }
}
