
public class IsoscelesTrapezoid extends Polygon{

	private double top;
	private double base;
	private double leg;
	private double area;
	private double triangleBase;
	private double height;
	
	public IsoscelesTrapezoid(double top, double base, double leg) {
		super(top,base,leg,leg);
		this.top = top;
		this.base = base;
		this.leg = leg;
	}
	
	public double getTop() {
		return top;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getLeg() {
		return leg;
	}
	
	public double getArea() {
		triangleBase = (top - base) * (top - base);
		height = Math.sqrt((leg * leg) - (triangleBase/4));
		area = ((top + base)/2) * height ;
		return area;
	}
	
	public Rectangle getCenterRectangle() {
		double height = Math.sqrt(leg * leg - (((base - top) * (base - top)) / 4));
		if(base > top) {
			return new Rectangle(top, height);
		}
		else {
			return new Rectangle(base, height);
		} 
		
	}
}
