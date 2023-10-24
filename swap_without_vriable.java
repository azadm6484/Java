import java.util.Scanner;
public class swap_without_vriable
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number1:");
        int num=in.nextInt();
        System.out.print("enter a number2:");
        int num1=in.nextInt();
        System.out.print("before swap using third variable\n"+"num="+num+" "+"num1="+num1);
        num=num-num1;
        num1=num+num1;
        num=num1-num;
        System.out.print("\nafter swap using third variable\n"+"num="+num+" "+"num1="+num1);

        
    }
}
