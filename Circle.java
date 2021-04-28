
public class Circle extends Shape {
	private double radius;	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	Circle(){
		radius=0.0;
		area=0.0;
	}	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	double calculateArea() {
		area=Math.PI*radius*radius;
		return area;
	}

}
