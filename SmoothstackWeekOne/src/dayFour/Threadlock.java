/**
 * 
 */
package dayFour;

/**
 * @author Sam Ebe
 * Assignment 2
 */
public class Threadlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String m1 = "yes";
		String m2 = "no";

		System.out.println("Starting my DL Demo");
		Runnable t1 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (m1) {
						Thread.sleep(100);
						synchronized (m2) {
							System.out.println("Thread 1 has accquired locks for M1 & M2");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (m2) {
						Thread.sleep(100); // business logic.
						synchronized (m1) {
							System.out.println("Thread 2 has accquired locks for M1 & M2");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(t1).start();
		new Thread(t2).start();
		System.out.println("End of my Deadlock Demo");
	}

}
