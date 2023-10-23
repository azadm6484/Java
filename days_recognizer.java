import java.util.Scanner;
public class days_recognizer {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.print("enter a number to recognise days:");
        int day=in.nextInt();
        switch(day)
        {
            case 1:
                System.out.print("day "+day+" monday");
                break;
            case 2:
                System.out.print("day "+day+" tuesday");
                break;
            case 3:
                System.out.print("day "+day+" wednesday");
                break;
            case 4:
                System.out.print("day "+day+" thusday");
                break;
            case 5:
                System.out.print("day "+day+" friday");
                break;
            case 6:
                System.out.print("day "+day+" saturday");
                break;
            case 7:
                System.out.print("day "+day+" sunday");
                break;
            default:
                System.out.print("invalid");
        }
    }
}
