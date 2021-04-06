
/**
 * @author Sam Ebe
 * Assignment 2 4/5/2021
 */

import java.util.Random;
import java.util.Scanner;

public class AssignTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		// generate rand num 1-100
		int ans = rand.nextInt(99) + 1;
		int inp = 0;
		Scanner sc = new Scanner(System.in);
		int tri = 1; // attempt number

		while (tri <= 5) {
			System.out.println("Guess my number! (1-100)  Attempt#" + tri);
			inp = sc.nextInt();

			if (inp < ans + 10 && inp > ans - 10) { // within +-10 of the answer
				System.out.println("Congrats! You were close enough to " + ans);
				sc.close();
				break;
			} else {
				tri++;
				if (tri == 6) {
					System.out.println("Git gud. It was " + ans + " and I'm not 'Sorry'.");
					sc.close();
				} else {
					System.out.println("Not close enough! Why don't you try again?");
				}
			}
		}
	}

}
