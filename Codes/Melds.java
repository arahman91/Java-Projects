package Math;
import java.util.Random;

public class Melds {
	private static int number;

	public static int[] chance(int percent, int hundred) {
		int chances[] = new int[percent];
		Random r = new Random();
		for (int i = 0; i < percent; i++) {
			chances[i] = r.nextInt(hundred-1) + 1;
			if (i > 0 && chances[i] == chances[i-1]) i--;
		}
		return chances;
	}

	/*
	 * Converts decimal numbers to integers
	 */
	public static int normalize (double percent) {
		int exponent = 1;
		while (percent * exponent != (int)(percent * exponent)) {
			exponent = exponent*10;
		}
		return exponent;
	}

	/**
	 * @param percent
	 */
	public static int attempt(double percent) {
		int exponent = normalize(percent);
		int hundred = 100 * exponent;
		Random r = new Random();
		int attempts = 0;
		int chances = (int) (percent * exponent);
		//System.out.println(chances + " , " + hundred);
		int corrects[] = chance(chances, hundred);
		//System.out.println(Arrays.toString(corrects));

		do {
			attempts++;
			number = r.nextInt(hundred-1) + 1;
			//System.out.println(number);
			for (int i: corrects) {
				if (i == number) return attempts; 
			}
		} while (attempts > 0);
		return attempts;
	}
}
