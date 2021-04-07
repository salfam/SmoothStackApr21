/**
 * 
 */

/**
 * @author samebe
 *
 */
import java.util.Random;

public class TwoDArraySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[][] sugarray = new int[5][3];
		int max = 0;
		int maxx=0;
		int maxy=0;
		for(int i=0; i<5; i++) {
			for(int k=0; k<3; k++) {
				sugarray[i][k]= rand.nextInt(100);
				if(sugarray[i][k] > max) {
					max=sugarray[i][k];
					maxx=k;
					maxy=i;
				}
				System.out.print("["+sugarray[i][k]+"] ");
			}
			System.out.println("");
		}
		System.out.println("The largest value is "+max+" at "+maxy+","+maxx);
	}

}
