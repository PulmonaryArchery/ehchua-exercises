package basic_4_1;

public class SumAverageRunningInt {

    public static void main(String[] args) {

        int sum = 0;
//        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
//        int count = 0;

        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            int squaredNumber = number * number;
            sum += squaredNumber;
//            count ++;
        }

//        int number = LOWERBOUND;

//        while (number <= UPPERBOUND) {
//            sum += number;
//            number++;
//        }

//        do {
//            sum += number;
//            number++;
//        } while (number <= UPPERBOUND);

//        average = sum / 100.00;

//        average = (double) sum / count;

//        System.out.println("The sum of 111 to 8899 is " + sum + "\nThe average is " + average);
        System.out.println("The sum of the square from 1 to 100 is " + sum);

    }

}
