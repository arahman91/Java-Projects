package myCodes;
import java.util.Scanner;

public class Hello2
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        System.out.println("You input " + input);
    }
}