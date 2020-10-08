public class Maths {
	public static int sum(int one,int two) {
		int num_1 = one;
		int num_2 = two;
		return num_1+num_2;
	}

	public static int subtract(int one,int two) {
		int num_1 = one;
		int num_2 = two;
		if (num_1 > num_2) return num_1 - num_2;
		else return num_2 - num_1;
	}

	public static String numlist(int[] args) {
		String nums = "";
		for (int i = 0; i < args.length - 2 ; i++)  nums += args[i] + ", ";
		return nums + args[args.length - 2] + " and " + args[args.length - 1];
	}

	public static int multisum(int ... args) {
		int sum = 0;
		for (int i: args) {
			sum += i;
		}
		return sum;
	}
}
