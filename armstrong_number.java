import java.util.Scanner;
public class armstrong_number {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=in.nextInt();
        int sum=0,r,s;
        s=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(s==sum)
        {
            System.out.println("armstrong number");
        }
        else
        System.out.print("not an armstrong number");
    }
}
