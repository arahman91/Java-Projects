package Math;

public class BaseConvert {
	public static String BinaryConvert(int decimal) {
		int num = decimal;
		String result = "";
		
		while (num > 0) {
			//result += (num % 2)*Math.pow(10, i++); //as int return
			result = (num % 2) + result;
			num = num / 2;
		}
		return result;
	}
	
	public static String OctalConvert(int decimal) {
		int num = decimal;
		String result = "";
		
		while (num > 0) {
			//result += (num % 2)*Math.pow(10, i++); //as int return
			result = (num % 8) + result;
			num = num / 8;
		}
		return result;
	}
	
	public static String BinaryFractionConvert(double decimal, int fraction) {
		String result = BinaryConvert((int) decimal) + ".";
		double num = decimal - (int) decimal;
		int i = 0;
		
		while (num != 0) {
			//result += (num % 2)*Math.pow(10, i++); //as int return
			num = num * 2;
			result += (int) num;
			num = num - (int) num;
			if (fraction > 0) {
				i++;
				if (i >= fraction) {
					result += "...";
					break;
				}
			}
		}
		return result;
	}
	
	
	public static String OctalFractionConvert(double decimal, int fraction) {
		String result = OctalConvert((int) decimal) + ".";
		double num = decimal - (int) decimal;
		int i = 0;
		
		while (num != 0) {
			num = num * 8;
			result += (int) num;
			num = num - (int) num;
			if (fraction > 0) {
				i++;
				if (i > fraction) {
					result += "...";
					break;
				}
			}
		}
		return result;
	}
	
	public static int BinaryToDecimal(int binary) {
		int num = binary;
		int i = 0;
		int result = 0;
		while (num !=0) {
			result += (num % 10) * (Math.pow(2, i++));
			num = num / 10;
		}
		return result;
	}
	
	public static int OctalToDecimal(int octal) {
		int num = octal;
		int i = 0;
		int result = 0;
		while (num !=0) {
			result += (num % 10) * (Math.pow(8, i++));
			num = num / 10;
		}
		return result;
	}
}
