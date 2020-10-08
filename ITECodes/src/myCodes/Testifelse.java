package myCodes;

public class Testifelse {
	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 7;
		int num3 = 9;
		int num4 = 10;

		if (num1 > num2)
			if (num2 > num3)
				num1 = num2;
			else num1 = num3;
		else
			if (num2 > num4)
				num1 = num2;
			else 
				num1 = num4;

		System.out.println(num1);
	}
}
