import java.util.Scanner;
public class age_tester{
    public static void main(String[] args)
    {
        
        Scanner in =new Scanner(System.in);
        System.out.print("enter your age:");
        int age= in.nextInt();
        System.out.print((age>0 && age<=12)?"you are under age":(age>12 && age<=18)?"you are teenager":"you are young");
        
        in.close();
        
    }
}
