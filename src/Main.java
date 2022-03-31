package com.company;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(7, "pink", true);

        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println();

        Rectangle rectangle = new Rectangle(20, 10, "blue", true);

        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println();

        Square square = new Square(20);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
