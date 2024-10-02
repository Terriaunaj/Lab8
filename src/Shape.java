
public abstract class Shape implements Comparable<Shape> {

	// TODO: Complete this class.
	private int id;
	private static int nextID = 0;

	protected Shape() {
		
		id = nextID;
		nextID++;
	}
	
	public int getID() {
		return id;
	}
	
	public abstract double getPerimeter();
	
	public abstract double getArea();
	
	public int compareTo(Shape other) {
		
		String one = getClass().getName();
        String two = other.getClass().getName();
        if (one.compareTo(two) < 0) {
            return -1;
        } 
        else if (one.compareTo(two) > 0) {
            return 1;
        } 
        else {
            if (getPerimeter() < other.getPerimeter()) {
                return -1;
            } 
            else if (getPerimeter() > other.getPerimeter()) {
                return 1;
            } 
            else {
                return Double.compare(getArea(), other.getArea());
            }
        }
	}
	
	
	@Override
	public String toString() {
		return "<"
				+ getClass().getName()
				+ ", ID: " + id
				+ ", PERIMETER: " + String.format("%.1f", getPerimeter())
				+ ", AREA: " + String.format("%.1f", getArea())
				+ ">";
	}
}