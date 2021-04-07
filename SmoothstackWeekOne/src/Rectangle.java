
public class Rectangle implements Shape {

	int x=1;
	int y=1;
	int area=1;
	public Rectangle() {
	}
	public Rectangle(int a, int b) {
		x=a;
		y=b;
	}
	@Override
	public int calculateArea() {
		//calculates area of shape
		area=x*y;
		return (area);
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "The area is "+area;
	}

}
