/**
 * 
 */
package dayFive;

import java.util.Arrays;

/**
 * @author Sam Ebe
 *
 */
public class GroupInts {

	/**
	 * @param args
	 */
	public static void main(Integer[] args) {
		// TODO Auto-generated method stub
		int start=args[0];
		int goal=args[args.length];
		Integer[] vals= Arrays.copyOfRange(args,1, args.length);
		System.out.println(groupInt(start,vals,goal));
	}
	
	public static boolean groupInt(int start, Integer[] nums,int target) {
		if(start >= nums.length)
	        return target == 0;
	          
	    int i = start;
	    int sum = 0;
	    
	    while(i < nums.length && nums[start] == nums[i]) {
	        sum += nums[i];
	        i++;
	    }
	                              
	    if(groupInt(i, nums, target - sum))
	        return true;
	                                        
	    if(groupInt(i, nums, target))
	        return true;
	                                                  
	    return false;
	}
}
