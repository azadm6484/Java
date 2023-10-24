import java.util.Scanner;
public class right_rhombus_pattern {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=in.nextInt();
        for(int i=1;i<=num+1;i++)
        {
            for(int j=1;j<=num-i+1;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=num+1;j++)
            {
                System.out.print("*");
            }

        System.out.println();
        }
        }
    }
