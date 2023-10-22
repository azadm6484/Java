import java.util.Scanner;
public class digit_counter {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number for count:");
        int num=in.nextInt();
        int c=0,r;
        while(num>0)
            {
                r=num%10;
                num=num/10;
                c=c+1;
            }
        System.out.print("the no of counted word are:"+c);
    }
}
