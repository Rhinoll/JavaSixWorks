package abstaction;

public class Circle extends Shape
{
    protected double radius;

    public Circle() {}

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

    @Override
    double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
