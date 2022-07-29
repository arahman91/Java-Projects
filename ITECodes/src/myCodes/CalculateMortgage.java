/*
 * Takes the mortgage amount, interest and
 * amortization period in years, and shows
 * the monthly payment.
 * 
 * Can also show the amount left after each month.
 * 
 * @author arahman91
 */


import java.util.Scanner;

public class CalculateMortgage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean debug = false; //Show debug outputs
		boolean showmonthly = true; //Show the monthly balance
		
		System.out.print("Enter the mortgage amount: ");
		int mortgage = scan.nextInt();
		System.out.print("Enter the annual interest percent: ");
		double interest  = scan.nextDouble() / (100*12); 
		//interest = interest / (100*12);
		System.out.print("Enter the amortization in years: ");
		int amort = scan.nextInt()*12;
		scan.close();
		
		if (debug) {
			System.out.printf("The amortization in months is: %d%n", amort);
			System.out.printf("The interest monthly is: %f%n" , interest);
		}
		
		double payment = (mortgage * interest)/(1 - (1 / Math.pow(1+interest, amort) ) );
		System.out.printf("The monthly payment is: $%.2f%n" , payment); //Format the output to 2 decimals
		
		if (showmonthly) {
			double principal = mortgage;
			for (int i = 1; i <= amort; i++) {
				principal = principal * (1 + interest) - payment;
				System.out.printf("The principal at month %d is: $%.2f%n" , i, principal);
			}
		}
	}

}
