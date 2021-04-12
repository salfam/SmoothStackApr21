/**
 * 
 */
package dayFive;

/**
 * @author Sam Ebe
 *
 */
//runnable
public class OddOrEven {
	public static StringBuilder getOddOrEven(int[] nlist) {
		StringBuilder ret = new StringBuilder("");
		Boolean f = false;
		for (int a : nlist) {
			if(f) {//insert comma before every new element after first
				ret.append(",");
			}
			if (a%2==0) {//checks if even for e
				//System.out.println(a+" is even");
				ret.append("e"+a);
			}else {
				//System.out.println(a+" is odd");
				ret.append("o"+a);
			}
			f=true;
		}
		return ret;
	}
	public static void main(String[] args) {
		int[] nums = new int[args.length];
		for(int i=0; i<args.length; i++) {
			nums[i]= Integer.parseInt(args[i]);
			//System.out.println(nums[i]);
		}
		StringBuilder ans = getOddOrEven(nums);
		System.out.println(ans);
	}
}