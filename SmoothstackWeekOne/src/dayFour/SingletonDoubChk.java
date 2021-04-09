/**
 * 
 */
package dayFour;

/**
 * @author Sam Ebe
 * Assignment 1
 */
public class SingletonDoubChk {
	
	volatile private static SingletonDoubChk instance = null;
	public SingletonDoubChk getSing() {
		if (instance == null) {
			synchronized (this) {
				if (instance == null) {
					instance = new SingletonDoubChk();
				}
			}
		}
		return instance;
	}
}
