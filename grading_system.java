import java.util.Scanner;
public class grading_system {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.print("enter marks of physics:");
        int phy=in.nextInt();
        System.out.print("enter marks of physics:");
        int che=in.nextInt();
        System.out.print("enter marks of physics:");
        int maths=in.nextInt();
        double avg=((double)phy+che+maths)/3;
        if(avg<100 && avg>80)
        {
            System.out.print("A+");
        }
        else if(avg<80 && avg>70)
        {
            System.out.print("B+");
        }
        else if(avg<70 && avg>60)
        {
            System.out.print("c+");
        }
        else if(avg<600 && avg>50)
        {
            System.out.print("D+");
        }
        else if(avg<50 && avg>40)
        {
            System.out.print("E+");
        }
        else
        {
            System.out.print("fail");
        }
    }
}
