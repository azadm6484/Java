import java.util.Scanner;
public class digits_sum {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=in.nextInt();
        int sum=0,r;
        while(num>0)
            {
                r=num%10;
                sum+=r;
                num=num/10;
            }
        System.out.print("the sum of the digits are:"+sum);
    }
}
