
public class Triangle extends Shape {

	private double base;
	private double height;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Triangle() {
		super();
		base=0.0;
		height=0.0;
	}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	double calculateArea() {
		area=0.5*base*height;
		return area;
	}

}
