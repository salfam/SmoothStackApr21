package dayTwo;
public class Circle implements Shape {

	int r=1;
	int area=1;
	public Circle() {
	}
	public Circle(int a) {
		r=a;
	}
	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		area= r*r;
		return area;
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "The area is " +area+"pi";
	}

}
