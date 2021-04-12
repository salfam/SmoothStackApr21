/**
 * 
 */
package dayFive;

import java.util.ArrayList;
import java.util.List;

/**runnable
 * @author Sam Ebe
 * args = although and but for are this oh
 */
public class StringPick {
	public static String[] getaXX(String[] alist) {
		//arraylist so length can vary
		List<String> picky = new ArrayList<String>();
		
		for(String a : alist) {
			//if 3 letters and starts with 'a'
			if(a.length()==3 && a.charAt(0)=='a') {
				picky.add(a);
			}
		}
		//converts arraylist to String[]
		return picky.toArray(new String[picky.size()]);
	}
	
	public static void main(String[] args) {
		String[] res = getaXX(args);
		//print results
		for(String s : res) {
			System.out.println(s);
		}
	}
}
