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

	/**runnable
	 * 0 [1 2 4 8 1] 14 -> true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] nums = new Integer[args.length];
		for(int i=0; i<args.length; i++) {
			nums[i]=Integer.parseInt(args[i]);
		}
		
		int start=nums[0];
		int goal=nums[nums.length-1];
		Integer[] vals= Arrays.copyOfRange(nums,1, nums.length);
		System.out.println(groupInt(start,vals,goal));
	}
	
	public static boolean groupInt(int start, Integer[] vals,int target) {
		if(start >= vals.length)
	        return target == 0;
	          
	    int i = start;
	    int sum = 0;
	    
	    while(i < vals.length && vals[start] == vals[i]) {
	        sum += vals[i];
	        i++;
	    }
	                              
	    if(groupInt(i, vals, target - sum))
	        return true;
	                                        
	    if(groupInt(i, vals, target))
	        return true;
	                                                  
	    return false;
	}
}
