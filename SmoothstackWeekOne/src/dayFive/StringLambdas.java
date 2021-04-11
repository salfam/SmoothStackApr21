/**
 * 
 */
package dayFive;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Sam Ebe
 *
 */
public class StringLambdas {

	public static void main(String[] args) {
		String[] a = { "eh", "longword", "words", "effort", "nevermind" };

		// sort short to long
		Arrays.sort(a, (o1, o2) -> (o1.length() - o2.length()));
		System.out.println("ordered short to long");
		for (String b : a) {
			System.out.println(b);
		}

		System.out.println("");// gap

		// long to short
		Arrays.sort(a, (o1, o2) -> (o2.length() - o1.length()));
		System.out.println("ordered long to short");
		for (String b : a) {
			System.out.println(b);
		}

		System.out.println("");// gap
		System.out.println("Sorting by e"); // this caused me immense pain and about 40tabs on chrome haha
		Arrays.sort(a, Comparator.comparing(o -> !o.startsWith("e")));
		for (String b : a) {
			System.out.println(b);
		}
		
		System.out.println("");// gap
		System.out.println("Sorting by e again");
		Arrays.sort(a, (s1, s2) -> Utils.sortByE(s1, s2));
		for (String b : a) {
			System.out.println(b);
		}
	}
}
