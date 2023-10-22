import java.util.Scanner;
public class body_mass_index {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter your weight:");
        int w=in.nextInt();
        System.out.print("enter your height:");
        int h=in.nextInt();
        float f=(float)w/h*h;
        System.out.println("the bmi of the person is"+f);
        System.out.print((f<=18.4)?"under weight":(f>=18.4 && f<24.5)?"not over weight":"over weight");
    }
}
