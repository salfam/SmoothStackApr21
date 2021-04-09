package dayFour;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class LineTest {
	Line a = new Line(1,1,2,2);
	
	@Test
	public void slopeTest() {
		assertEquals(1, a.getSlope(), 0.0001);
	}
	@Test
	public void distanceTest() {
		assertEquals(Math.sqrt(2),a.getDistance(), 0.0001);
	}

	@Test
	public void paraTest() {
		Line b = new Line(5,5,6,6);
		assertEquals(true,a.paraTo(b));
	}
}
