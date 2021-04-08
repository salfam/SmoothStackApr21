/**
 * 
 */
package dayThree;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author sameb
 *
 */
public class countChar {

	/**
	 * @param args[0] is the char to search for
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char find = 'E';
		Integer count = 0;
		if (args.length > 0) {
			find = args[0].charAt(0);
		}
		String line = null;
		try {
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(new FileReader("src/dayThree/loremipsum"));
			while((line = reader.readLine()) !=null) {
				for(int i=0; i<line.length(); i++) {
					if(line.charAt(i) == find) {
						count++;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("The char "+find+" occured in the file "+count+" time(s).");
	}

}
