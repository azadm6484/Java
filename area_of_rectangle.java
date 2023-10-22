import java.util.Scanner;
public class area_of_rectangle {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter lenght:");
        int l=in.nextInt();
        System.out.println("enter width:");
        int w=in.nextInt();
        System.out.print("area of rectangle:"+l*w);
        in.close();
    }
}
