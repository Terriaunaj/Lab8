import java.util.Comparator;


public class ShapeIDComparator implements Comparator<Shape>{

	@Override
	public int compare(Shape s1, Shape s2) {
		// TODO Auto-generated method stub
		return s1.getID() - s2.getID();
	}

}
