package abstaction;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        double radius;
        String color = "красный";
        double width;
        double length;
        double side;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        radius = input.nextDouble();
        Circle circle = new Circle(color, true, radius);
        System.out.println("Окружность: " + circle.toString());
        System.out.println("Длина окружности - " + circle.getPerimeter());
        System.out.println("Площадь окружности - " + circle.getArea());

        System.out.println("\n");

        System.out.print("Введите ширину прямоугольника: ");
        width = input.nextDouble();
        System.out.print("Введите длину прямоугольника: ");
        length = input.nextDouble();
        Rectangle rectangle = new Rectangle(color, false, width, length);
        System.out.print("Прямоугольник: " + rectangle.toString());
        System.out.print("\nПериметр прямоугольника - " + rectangle.getPerimeter());
        System.out.print("\nПлощадь прямоугольника - " + rectangle.getArea());

        System.out.println("\n");

        System.out.print("Введите сторону квадрата: ");
        side = input.nextDouble();
        Square square = new Square(color, true, side);
        square.setColor("синий");
        square.setWidth(side);
        square.setLength(side);
        System.out.print("Квадрат: " + square.toString());
        System.out.print("\nПериметр квадрата - " + square.getPerimeter());
        System.out.print("\nПлощадь квадрата - " + square.getArea());
    }
}

