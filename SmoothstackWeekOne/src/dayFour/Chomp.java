/**
 * 
 */
package dayFour;

/**
 * @author Sam Ebe
 * Assignment 3
 *
 */
public class Chomp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		final Diner sans = new Diner();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					sans.cook();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					sans.eat();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}
}