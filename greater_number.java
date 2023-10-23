import java.util.Scanner;
public class greater_number {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter number 1:");
        int a=in.nextInt();
        System.out.print("enter number 2:");
        int b=in.nextInt();
        System.out.print("enter number 3:");
        int c=in.nextInt();
        System.out.print((a>b && a>c)?a+" is greates":(b>a && b>c)?b+" is greates":c+" is greates");
    }
}
