import java.util.Scanner;
public class even_number {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number for count:");
        int num=in.nextInt();
        System.out.print((num%2==0)?"even number":"odd number");
    }
}
