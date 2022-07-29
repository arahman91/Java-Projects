package Math;
import java.util.Scanner;

public class NumInput
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("You input " + input);
		scan.close();
	}
}