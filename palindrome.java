import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string number to check if it is a palindrome:");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
        reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
        System.out.print("Entered string number is a palindrome.");
        else
        System.out.print("Entered string number isn't a palindrome.");
    }
}