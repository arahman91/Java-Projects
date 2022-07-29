package Math;

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
	
	public static int[] notes(int money) {
		int[] notes = {1, 2, 5, 10, 20, 50, 100, 500};
		int i = money;
		
		int[] result = new int[8];
		for (int j = notes.length - 1; j >= 0; j--) {
			result[j] = (int) (i/notes[j]);
			//System.out.printf("Money amount: $%d, current note: $%d%n", i, notes[j]);
			//System.out.printf("Number of notes: %d%n", result[j]);
			i = i % notes[j];
		}
		return result;
	}
	
	/**
	 * @param money The amount of money
	 * @return The list of notes in text form
	 */
	public static String listnotes (int money) {
		int[] noteslist = {1, 2, 5, 10, 20, 50, 100, 500};
		int[] notes = notes(money);
		
		while (notes[0] == 0) {
			int[] tempnotes = new int[notes.length - 1];
			for (int i = 0; i < tempnotes.length; i++) tempnotes[i] = notes[i+1];
			notes = tempnotes;
			
			int[] tempnoteslist = new int[noteslist.length - 1];
			for (int i = 0; i < tempnoteslist.length; i++) tempnoteslist[i] = noteslist[i+1];
			noteslist = tempnoteslist;
		}
		//System.out.println(numlist(notes)+ "\n" + numlist(noteslist));
		
		
		String result = "";
		for (int j = notes.length - 1; j > 0; j--) {
			//System.out.printf("At position %d%n", j);
			if (notes[j] == 0) continue;
			result += notes[j] + " $" + noteslist[j] + " note";
			if (j > 2) {
				if (notes[j] == 1) result += ", ";
				else result += "s, ";
			}
			else {
				if (notes[j] == 1) result += " ";
				else result += "s ";
			}
		}
		if (notes[0] == 1) return result + "and " + notes[0] + " $"+ noteslist[0] +" note";
		else return result + "and " + notes[0] + " $"+ noteslist[0] +" notes";
	}
}

