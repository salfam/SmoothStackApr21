/**
 * 
 */
package dayFive;

/**run it
 * @author Sam Ebe
 *
 */
public class removeX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fied = args;//results
		
		System.out.print("input: [");
		for (String s : args) {
			System.out.print(s + ",");
		}
		System.out.println("]");
		
		int ele = 0;//index
		System.out.print("without x: [");
		for (String s : args) {
			fied[ele] = s.toLowerCase().replace("x", "");
			System.out.print(fied[ele] + ",");
			ele++;
		}
		System.out.println("]");
	}
}
