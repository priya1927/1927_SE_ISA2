
public class GetShapeFactory {

	public Shape getShape(String shapeName) {
		if(shapeName==null)
			return null;
		if(shapeName.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		if(shapeName.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		if(shapeName.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}
