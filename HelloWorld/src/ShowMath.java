import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author Afzal Rahman
 *
 */
public class ShowMath {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Scanner scan = new Scanner(System.in);
		final int average = 20; //Number of times to run attempts to get an average
		int total_attempts = 0;

		//Sum of two numbers
		System.out.print("Enter number 1: ");
		final int num_1 = scan.nextInt();
		System.out.print("Enter number 2: ");
		final int num_2 = scan.nextInt();
		System.out.println("The sum of "+ num_1 + " and " + num_2 + " is " 
				+ Maths.sum(num_1, num_2));

		//Sum of multiple numbers
		System.out.print("Enter multiple numbers, end with e: ");
		final List<Integer> multinums = new ArrayList<Integer>();
		while (scan.hasNextInt()) multinums.add(scan.nextInt());
		scan.next(); //dump the non-int
		final int[] multinum = new int[multinums.size()];
		for (int i = 0; i < multinums.size(); i++) 
			multinum[i] = multinums.get(i);
		System.out.println("The sum of " + Maths.numlist(multinum) 
		+ " is " + Maths.multisum(multinum));

		System.out.print("Enter the chance percentage: ");
		final double percentage = scan.nextDouble();
		scan.close();
		for (int i = 0; i < average; i++) 
			total_attempts += Melds.attempt(percentage);
		System.out.println("A " + percentage +"% chance takes " + 
				((int)(Math.ceil(total_attempts/average))) 
				+ " attempts on average.");
	}
}
