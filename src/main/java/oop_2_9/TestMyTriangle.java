package oop_2_9;

public class TestMyTriangle {

    public static void main(String[] args) {

        MyTriangle t1 = new MyTriangle(3, 6, 9, 12, 15, 18);
        System.out.println(t1);
        MyTriangle t2 = new MyTriangle(new MyPoint(3, 6), new MyPoint(9, 12), new MyPoint(15, 18));
        System.out.println(t2);

        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());

    }

}
