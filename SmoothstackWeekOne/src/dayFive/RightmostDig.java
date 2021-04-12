/**
 * 
 */
package dayFive;

/**
 * @author Sam Ebe
 *
 */
public class RightmostDig {

	/**run it dummy
	 * @param args
	 */
	public static void main(String[] args) {
		//convert args to int array
		Integer[] nums = new Integer[args.length];
		for(int i=0; i<args.length; i++) {
			nums[i]=Integer.parseInt(args[i]);
		}
		System.out.print("input: [");
		for(int i : nums) {
			System.out.print(i+",");
		}
		System.out.println("]");
		
		//call getRightMost on num array & output
		Integer[] vals = getRightMost(nums);
		System.out.print("rightmost values: [");
		for(int i : vals) {
			System.out.print(i+",");
		}
		System.out.println("]");
		
		//call doubleInts on num array & output
		Integer[] morevals = doubleInts(nums);
		System.out.print("doubled: [");
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
