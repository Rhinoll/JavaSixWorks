package abstaction;

public class Square extends Rectangle
{
    public double side;

    Square(){}

    public Square(double side) {}

    public Square(String color, boolean filled, double side)
    {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    @Override
    public void setWidth(double width)
    {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length)
    {
        super.setLength(length);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
