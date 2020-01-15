public class Triangle{
    public double area = 0;

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c,){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    area = (a.getX()(b.getY() -c.getY()) + b.getX()(c.getY() -a.getY()) + c.getX()(a.getY() - b.getY()))/2;

}