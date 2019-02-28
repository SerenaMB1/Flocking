
package geometry;


public class LineSegment {

	private CartesianCoordinate startPoint;
	private CartesianCoordinate endPoint;
	
	public LineSegment(CartesianCoordinate start, CartesianCoordinate end){
		startPoint = start;
		endPoint = end;
	}
	public CartesianCoordinate getStartPoint(){
		return startPoint;
	}
		
	public CartesianCoordinate getEndPoint(){
		return endPoint;
	}
	
	public double Length(){
		
		 double Length;
		 Length = Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) + Math.pow(endPoint.getY() - startPoint.getY(), 2));
	
		return Length;
		
	}
}
