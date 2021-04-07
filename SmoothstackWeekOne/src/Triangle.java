
public class Triangle implements Shape {
	
	int x=1;
	int y=1;
	int area=1;
	public Triangle() {
	}
	public Triangle(int a, int b) {
		x=a;//base length
		y=b;//height of triangle
		//using side lengths would be more effort than is needed
	}
	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		area=(x*y/2);
		return area;
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "The area is "+ area;
	}

}
