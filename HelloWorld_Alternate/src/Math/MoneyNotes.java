package Math;

import java.util.Scanner;

public class MoneyNotes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How much money do you need? ");
		int money = scan.nextInt();
		
		scan.close();
		
		System.out.println("You get back " + Maths.listnotes(money));
	}
}
