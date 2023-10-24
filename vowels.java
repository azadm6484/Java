import java.util.Scanner;
public class vowels
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a character:");
        char num=in.next().charAt(0);

        if(num=='A' || num=='E' || num=='I' || num=='O' || num=='U' || num=='a' || num=='e' || num=='i' || num=='o' || num=='u')
        {
            System.out.print("vowel");
        }
        else
        {
            System.out.print("not vowel");
        }
    }
}
