/**
 * 
 */
package dayFive;

/**
 * @author Sam Ebe
 *
 */
public class RightmostDig {

	/**
	 * @param args
	 */
	public static void main(Integer[] args) {
		//output for rightmost integers
		Integer[] vals = getRightMost(args);
		System.out.print("[");
		for(int i : vals) {
			System.out.print(i+",");
		}
		System.out.println("]");
		
		//output for doubled integers
		Integer[] morevals = doubleInts(args);
		System.out.print("[");
		for(int i : morevals) {
			System.out.print(i+",");
		}
		System.out.println("]");
	}
	
	public static Integer[] getRightMost(Integer[] list){
		Integer[] right = new Integer[list.length];
		int ele =0;//keeps spot in arrays sync
		for(int i : list) {
			right[ele]=i%10;
			ele++;
		}
		return right;
	}
	
	public static Integer[] doubleInts(Integer[] list) {
		Integer[] doubled = new Integer[list.length];
		for(int i=0; i<list.length; i++) {
			doubled[i]= list[i]*2;
		}
		return doubled;
	}

}
