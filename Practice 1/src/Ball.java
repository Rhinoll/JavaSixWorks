public class Ball {

    private String color;
    private int radius;

    public Ball(String col, int rad){
        color = col;
        radius = rad;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setRadius (int radius) {
        this.radius = radius;
    }

    public String getColor(String color){
        return color;
    }
    public int getRadius(int radius) {
        return radius;
    }
    public String toString(){
        return this.color +", radius "+this.radius;
    }
}

