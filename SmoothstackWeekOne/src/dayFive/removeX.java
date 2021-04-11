/**
 * 
 */
package dayFive;

/**
 * @author Sam Ebe
 *
 */
public class removeX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fied = args;
		int ele = 0;//index
		System.out.print("[");
		
		for (String s : args) {
			fied[ele] = s.toLowerCase().replace("x", "");
			System.out.print(fied[ele] + ",");
			ele++;
		}
		System.out.println("]");
	}
}
