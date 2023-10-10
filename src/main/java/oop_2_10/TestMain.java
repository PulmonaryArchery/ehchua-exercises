package oop_2_10;

public class TestMain {

    public static void main(String[] args) {

        MyRectangle r1 = new MyRectangle(15, 30, 45, 60);
        System.out.println(r1);
        MyRectangle r2 = new MyRectangle(new MyPoint(15, 30), new MyPoint(45, 60));
        System.out.println(r2);

        r1.setTopLeft(new MyPoint(30, 45));
        r1.setBottomRight(new MyPoint(60, 75));
        System.out.println("r1 topLeft is: " + r1.getTopLeft());
        System.out.println("r1 bottomRight is: " + r1.getBottomRight());

        System.out.println("r1 perimeter is: " + r1.getPerimeter());
        System.out.println("r1 area is: " + r1.getArea());

    }

}
