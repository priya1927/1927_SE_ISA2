import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		GetShapeFactory shapeFactory=new GetShapeFactory();
		System.out.println("Enter the name of the shape [Circle/Triangle/Rectangle]:");
		Scanner sc=new Scanner(System.in);
		String shapeName=sc.next();
		switch(shapeName) {
			case "Circle":
						double radius;
						System.out.println("Enter the radius of the circle:");
						radius=sc.nextDouble();
						Circle s1=(Circle) shapeFactory.getShape("Circle");
						s1.setRadius(radius);
						System.out.println("Area of the circle is="+s1.calculateArea());
						break;
			case "Triangle":
						double base;
						double height;
						System.out.println("Enter the base of the triangle:");
						base=sc.nextDouble();
						System.out.println("Enter the height of the triangle:");
						height=sc.nextDouble();
						Triangle s2=(Triangle) shapeFactory.getShape("Triangle");
						s2.setBase(base);
						s2.setHeight(height);
						System.out.println("Area of the circle is="+s2.calculateArea());
						break;
			case "Rectangle":
						double length;
						double breadth;
						System.out.println("Enter the length of the rectangle:");
						length=sc.nextDouble();
						System.out.println("Enter the breadth of the rectangle:");
						breadth=sc.nextDouble();
						Rectangle s3=(Rectangle) shapeFactory.getShape("Rectangle");
						s3.setBreadth(breadth);
						s3.setLength(length);
						System.out.println("Area of the rectangle is="+s3.calculateArea());
						break;
			default:
						System.out.println("Please enter Circle/Triangle/Rectangle as the shape");
		}
	}
}
