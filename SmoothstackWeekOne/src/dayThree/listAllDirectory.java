/**
 * 
 */
package dayThree;

import java.io.File;

/**
 * @author sameb
 *
 */
public class listAllDirectory {

	//		/git/SmoothStackApr21/src/
	/**
	 * @param args
	 */
	
	/*pass directory as CLArg
	 * I used "src/dayTwo" for testing
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pathnames = {"Mistakes","were","made"};
		File f = new File("SmoothStackApr21/src");
		try{
			f = new File(args[0]);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			pathnames = f.list();
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		for (String p : pathnames) {
			System.out.println(p);
		}
	}

}
