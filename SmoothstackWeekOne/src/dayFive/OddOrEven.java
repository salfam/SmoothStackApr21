/**
 * 
 */
package dayFive;

/**
 * @author Sam Ebe
 *
 */
public class OddOrEven {
	public static String getOddOrEven(Integer[] nlist) {
		String ret = "";
		Boolean f = false;
		for (int a : nlist) {
			if(f) {//insert comma before every new element after first
				ret+=",";
			}
			if (a%2==0) {//checks if even for e
				ret+= "e"+a;
			}else {
				ret+= "o"+a;
			}
			f=true;
		}
		return ret;
	}
}
