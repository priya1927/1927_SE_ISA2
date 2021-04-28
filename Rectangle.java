
public class Rectangle extends Shape {

	private double length;
	private double breadth;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public Rectangle() {
		super();
		length=0.0;
		breadth=0.0;
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double calculateArea() {
		area=length*breadth;
		return area;
	}

}
