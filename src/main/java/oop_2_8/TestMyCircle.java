package oop_2_8;

import java.util.Arrays;

public class TestMyCircle {

    public static void main(String[] args) {

        MyCircle circle1 = new MyCircle();
        MyCircle circle2 = new MyCircle(5, 10, 8);
        System.out.println(circle2);
        MyCircle circle3 = new MyCircle(new MyPoint(8, 16), 14);
        System.out.println(circle3);

        circle2.setRadius(20);
        System.out.println("circle2 radius is: " + circle2.getRadius());
        circle2.setCenter(new MyPoint(24, 36));
        System.out.println("circle2 center is: " + circle2.getCenter());
        circle2.setCenterX(40);
        System.out.println("circle2 centerX is: " + circle2.getCenterX());
        circle2.setCenterY(48);
        System.out.println("circle2 centerY is: " + circle2.getCenterY());
        circle2.setCenterXY(58, 62);
        System.out.println("circle2 centerXY is: " + Arrays.toString(circle2.getCenterXY()));
        System.out.println(circle2);

        System.out.println(circle2.getArea());
        System.out.println(circle2.getCircumference());
        System.out.println(circle2.distance(new MyCircle(new MyPoint(80, 36), 32)));

    }

}
