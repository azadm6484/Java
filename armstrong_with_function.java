import java.util.Scanner;
public class armstrong_with_function {
    static int Armstrong(int n)
    {
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        return(sum);
    }
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.print("enter the number:");
        int num =in.nextInt();
        int x=Armstrong(num);
        if(x==num)
        {
            System.out.print("armstrong");
        }
        else
        {
            System.out.print("not armstrong");
        }

    }
}
