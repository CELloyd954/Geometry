public class PointTester {
	public static void main(String[] args) {
		
		double distance = 0;

		Point point1 = new Point(3, 2);
		Point point2 = new Point(4, 7);

		distance = MATH.sqrt((MATH.abs(point2.getX() - point1.getX()) * (MATH.abs(point2.getX() - point1.getX()) + 
					(MATH.abs(point2.getY() - point1.getY()) * (MATH.abs(point2.getY() - point1.getY()));

		System.out.println("First point: (" + point1.getX() + ", " + point1.getY() + ")";
		System.out.println("Second point: (" + point2.getX() + ", " + point2.getY() + ")";
		System.out.println("Distance between points: " + distance);

	}
}