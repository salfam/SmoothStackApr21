/**
 * 
 */
package dayFive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author Sam Ebe
 *
 */
public class LambdasAssignment {

	/**runnable
	 * 1 tests even/odd
	 * 2 tests prime/composite
	 * 3 tests palindrome or nah
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> res = new ArrayList<>();
		String filepath = new File("src/dayFive/input.txt").getAbsolutePath();
		try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
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

		for (int i = 1; i <= fl; i++) {
			code = Integer.parseInt(res.get(i).substring(0, 1));
			test = Integer.parseInt(res.get(i).substring(2,res.get(i).length()));
			//System.out.println("code is "+code);
			//System.out.println("test is "+test);
			switch (code) {
			case 1: {// odd or even
				if (test % 2 == 1) {
					System.out.println("ODD");
				} else {
					System.out.println("EVEN");
				}
				break;
			}
			case 2: {// prime
				for (int a = 2; a <= test / 2; a++) {
					if (test%a == 0) {
						System.out.println("COMPOSITE");
						break;
					}else if(a==test/2) {
						System.out.println("PRIME");
						break;
					}
				}
				break;
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
					break;
				}
				System.out.println("NOT PALINDROME");
				break;
			}
			}
		}

	}

}
