package myCodes;

import java.util.Scanner;

public class CalculateMortgage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean debug = false; //Show debug outputs
		
		System.out.print("Enter the mortgage amount: ");
		int mortgage = scan.nextInt();
		System.out.print("Enter the annual interest percent: ");
		double interest  = scan.nextInt(); 
		interest = interest / (100*12);
		System.out.print("Enter the amortization in years: ");
		int amort = scan.nextInt()*12;
		scan.close();
		
		if (debug) {
			System.out.printf("The amortization in months is: %d%n", amort);
			 System.out.printf("The interest monthly is: %f%n" , interest);
		}
		
		double payment = (mortgage * interest)/(1 - (1 / Math.pow(1+interest, amort) ) );
		System.out.printf("The monthly payment is: $%.2f" , payment); //Format the output to 2 decimals
	}

}
