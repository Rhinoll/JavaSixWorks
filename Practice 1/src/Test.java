import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {

        Ball ball1 = new Ball("Yellow", 8);
        Ball ball2 = new Ball("Blue", 6);
        Ball ball3 = new Ball ("Black", 20);

        System.out.println(ball1);
        System.out.println(ball2);
        ball2.setRadius(12);
        ball2.setColor("Orange");
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
