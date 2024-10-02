
public abstract class Polygon extends Shape{

	private double perimeter;
	
	protected Polygon(double... sides) {
		
		if(sides == null) {
			throw new IllegalArgumentException("null sides");
		}
		
		if(sides.length < 3) {
			throw new IllegalArgumentException("Invalid number of sides: " + sides.length);
		}
		
		double sum = 0;
		for(int i = 0; i < sides.length; i++) {
			sum += sides[i];
			perimeter = sum;
			
			if(sides[i] < 0 || sides[i] == 0) {
				perimeter = 0;
				throw new IllegalArgumentException("Nonpositive side: " + sides[i]);
			}
		}
		
		double sideSum = 0;
		for(int i = 0; i < sides.length; i++) {
			sideSum = perimeter - sides[i];
			
			if(sides[i] >= sideSum) {
				perimeter = 0;
				throw new IllegalArgumentException("Polygon inequality violated: " + sides[i] + " >= " + sideSum);
			}
		}
	}
	
	public double getPerimeter() {
		return perimeter;
	}
}
