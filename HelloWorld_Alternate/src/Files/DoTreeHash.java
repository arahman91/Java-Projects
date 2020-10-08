package Files;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class DoTreeHash {
	 public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
		 File filetocheck = new File("O:/Users/1809Pro/Documents/Electronic Arts/The Sims 3/compositorCache.package");
		 System.out.println(TreeHashExample.toHex(TreeHashExample.computeSHA256TreeHash(filetocheck)));
	 }
}
