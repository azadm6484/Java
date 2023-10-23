import java.util.Scanner;
public class plus_pattern {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=in.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                if(j==(num/2)+1 || i==(num/2)+1)
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
