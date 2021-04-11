/**
 * 
 */
package dayFive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author Sam Ebe
 *
 */
public class LambdasAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> res = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("dayFive/input"))) {
			while (br.ready()) {
				res.add(br.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// first line value is the number of lines upcoming
		int fl = Integer.parseInt(res.get(0));
		int code = 0;
		int test = 0;

		for (int i = 0; i < fl; i++) {
			code = Integer.parseInt(res.get(i).substring(0, 1));
			test = Integer.parseInt(res.get(i).substring(2));

			switch (code) {
			case 1: {// odd or even
				if (test % 2 == 1) {
					System.out.println("ODD");
				} else {
					System.out.println("EVEN");
				}
			}
			case 2: {// prime
				for (int a = 2; a <= test / 2; a++) {
					if (test % a == 0) {
						System.out.println("COMPOSITE");
					}
				}
				System.out.println("PRIME");
			}
			case 3: {// racecar
				int num = test;
				int rev = 0;
				int rem = 0;
				while (num != 0) {
					rem = num % 10;
					rev = rev * 10 + rem;
					num /= 10;
				}
				if (test == rev) {
					System.out.println("PALINDROME");
				} else {
					System.out.println("NOT PALINDROME");
				}
			}
			}
		}

	}

}
