package dayOne;
/**
 * 
 */

/**
 * @author Sam Ebe Assignment 1 4/5/2021
 */
public class AssignOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printOne();
		printTwo();
		printThree();
		printFour();
	}

	public static void printOne() {
		System.out.println("1)");
		int a = 1; // asterisks
		// prints 1 star then another star each line up to 4 stars
		while (a < 5) {
			for (int i = a; i > 0; i--) {
				System.out.print("*");
			}
			System.out.println("");
			a++;
		}
		// prints 9 periods
		System.out.println(".........");

	}

	public static void printTwo() {
		System.out.println("2)");
		// prints 10 periods
		System.out.println("..........");

		int a = 4; // asterisks
		// prints 4 stars then one less each line
		while (a > 0) {
			for (int i = 0; i < a; i++) {
				System.out.print("*");
			}
			System.out.println("");
			a--;
		}

	}

	public static void printThree() {
		System.out.println("3)");

		String stars = "*"; // asterisks
		String space = "     "; // how many spaces on each side
		while (stars.length() < 8) {
			System.out.println(space + stars + space);
			stars = stars + "**";
			space = space.substring(0, space.length() - 1);
		}

		// prints 11 periods
		System.out.println("...........");
	}

	public static void printFour() {
		System.out.println("4)");
		// prints 12 periods
		System.out.println("............");

		String stars = "*******"; // asterisks
		String space = "  "; // how many spaces on each side
		while (stars.length() >= 1) {
			System.out.println(space + stars + space);
			space = space + " ";
			if (stars.length() == 1) {
				break;
			}
			stars = stars.substring(0, stars.length() - 2);
		}

	}
}
