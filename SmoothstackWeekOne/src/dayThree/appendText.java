package dayThree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * 
 */

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sameb
 *
 */
public class appendText {

	/**
	 * @param args are words appended to /dayThree/loremipsum
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter("src/dayThree/loremipsum", true);
		String[] comments = { "lol", "this^" };
		// optional CLArgs for comment
		if (args.length > 0) {
			comments = args;
		}
		String out = "";
		for (int i = 0; i < comments.length; i++) {
			out += (comments[i] + " ");
		}

		/* yea just ignore this stuff it didn't work
		 * System.out.println("OUT IS =" + out); // tries making writer for CLArg file
		 * if (args.length > 0) { try { File clafile = new File(args[0]); writer = new
		 * FileWriter(clafile, true); } catch (Exception e) { e.printStackTrace(); }
		 */

		try {
			writer.append(out);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
