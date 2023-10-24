import java.util.Scanner;
public class pramid_pattern {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=in.nextInt();
        num+=1;
        for(int i=1;i<=num-1;i++)
        {
            for(int j=1;j<=num-i-1;j++)
            {
                if(i==num)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
