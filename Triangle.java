public class Triangle{
    public double area = 0;

    private Point Point1;
    private Point Point2;
    private Point Point3;

    public Triangle(Point a, Point b, Point c,){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double area(){

    area = (a.getX()(b.getY() -c.getY()) + b.getX()(c.getY() -Point1.getY()) + c.getX()(a.getY() - b.getY()))/2;
    }
}