/**
 * 
 */
package dayFive;

/**
 * @author Sam Ebe
 *
 */
public class Utils {
	static int sortByE(String a, String b) {
		if (a.charAt(0)=='e') {
			return 1;
		}else if(b.charAt(0)=='e') {
			return 0;
		}
		return 0;
	}
}
