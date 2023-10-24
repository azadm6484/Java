import java.util.Scanner;
public class prime_number {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=in.nextInt();
        boolean flag=false;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=true;
            }
        }
        if(flag)
        {
            System.out.print("not prime number");
        }
        else
        System.out.print("prime number");
    }
}
