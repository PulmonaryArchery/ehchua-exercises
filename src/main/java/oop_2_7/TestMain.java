package oop_2_7;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {

        MyLine line1 = new MyLine(4, 2, 8, 6);
        System.out.println(line1);

        MyLine line2 = new MyLine(new MyPoint(14, 12), new MyPoint(18, 16));
        System.out.println(line2);

        line1.setBegin(new MyPoint(22, 20));
        System.out.println("line1 begin is: " + line1.getBegin());
        line1.setEnd(new MyPoint(30, 34));
        System.out.println("line1 end is: " + line1.getEnd());

        line1.setBeginX(26);
        System.out.println("line1 beginX is: " + line1.getBeginX());
        line1.setBeginY(28);
        System.out.println("line1 beginY is: " + line1.getBeginY());

        line1.setEndX(40);
        System.out.println("line1 endX is: " + line1.getEndX());
        line1.setEndY(50);
        System.out.println("line1 endY is: " + line1.getEndY());

        line1.setBeginXY(80, 86);
        System.out.println("line1 beginXY is: " + Arrays.toString(line1.getBeginXY()));
        line1.setEndXY(120, 128);
        System.out.println("line1 endXY is: " + Arrays.toString(line1.getEndXY()));

        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());

    }

}
