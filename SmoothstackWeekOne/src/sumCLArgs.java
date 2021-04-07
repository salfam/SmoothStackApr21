/**
 * 
 */

/**
 * @author samebe
 *
 */
public class sumCLArgs {

	/**
	 * @param args Take multiple values from the command line and show the result of
	 *             adding all of them
	 */
	public static void main(String[] args) {
		int sum = 0;
		for (String s : args) {
			try {
				sum += Integer.parseInt(s);
			} catch (NumberFormatException e) {
					System.out.println("Your sum is " + sum);
					break;
			}
		}
		System.out.println("Your sum is " + sum);
	}
}
