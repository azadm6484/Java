import java.util.Scanner;
public class hollow_solid_pattern {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=in.nextInt();
        for(int i=0;i<=num;i++)
        {
            for(int j=0;j<=num;j++)
            {
                if(j==0 || i==num ||i==0 || j==num)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}