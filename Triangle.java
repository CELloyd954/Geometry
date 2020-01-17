public class Triangle{

    private Point Point1;
    private Point Point2;
    private Point Point3;

<<<<<<< HEAD
    public Triangle(Point Point1, Point Point2, Point Point3){
        this.Point1= Point1;
        this.Point2 = Point2;
        this.Point3 = Point3;
=======
    public Triangle(Point a, Point b, Point c,){
        this.a = a;
        this.b = b;
        this.c = c;
>>>>>>> 33dbc09d7f713f1ac7fb676345b44ce632c28d06
    }
    
    public double Area(Point Point1, Point Point2, Point Point3){

    double area = (Point1.getX()(Point2.getY() -Point3.getY()) + Point2.getX()(Point3.getY() -Point1.getY()) + Point3.getX()(Point1.getY() - Point2.getY()))/2;
    }
}