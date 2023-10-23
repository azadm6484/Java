import java.util.Scanner;
public class hollow_r_a_triangle {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=in.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0 || i==num-1 ||i==j)
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
