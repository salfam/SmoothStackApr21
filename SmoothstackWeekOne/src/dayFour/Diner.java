/**
 * 
 */
package dayFour;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author Sam Ebe
 * Part of Assignment 3
 */
public class Diner {
	LinkedList<Integer> orders = new LinkedList<>();
	int limit = 3;
	Random rand = new Random();
	
	public void cook() throws InterruptedException{
		int food = 0;
		while(true) {
			synchronized (this) {
				while (orders.size() == limit) {
					wait();
				}
				food = rand.nextInt(100);
				System.out.println("Mama Mia! A hot and spicy "+food+" coming right up!");
				orders.add(food);
				notify();
				Thread.sleep(1000);
			}
		}
	}
	
	public void eat() throws InterruptedException{
		while(true) {
			synchronized (this) {
				while (orders.size() == 0) {
					wait();
				}
				int plate = orders.removeFirst();
				System.out.println("Wow that "+plate+" was delicious!");
				notify();
				Thread.sleep(1000);
			}
		}
	}
}

