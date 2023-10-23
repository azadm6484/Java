import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter number for fibonacci:");
        int fib=in.nextInt();
        if(fib>0)
        {
            int a=0,b=1,c;
            System.out.print(a+" "+b);
            for(int i=3;i<=fib;i++)
            {
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }
        }
    }
}
