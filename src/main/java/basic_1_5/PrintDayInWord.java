package basic_1_5;

public class PrintDayInWord {

    public static void main(String[] args) {

        printDayInWord(0);
        printDayInWord(1);
        printDayInWord(2);
        printDayInWord(3);
        printDayInWord(4);
        printDayInWord(5);
        printDayInWord(6);
        printDayInWord(7);

    }

    public static void printDayInWord(int dayNumber) {

//        if (dayNumber == 0) {
//            System.out.println("Sunday");
//        } else if (dayNumber == 1) {
//            System.out.println("Monday");
//        } else if (dayNumber == 2) {
//            System.out.println("Tuesday");
//        } else if (dayNumber == 3) {
//            System.out.println("Wednesday");
//        } else if (dayNumber == 4) {
//            System.out.println("Thursday");
//        } else if (dayNumber == 5) {
//            System.out.println("Friday");
//        } else if (dayNumber == 6) {
//            System.out.println("Saturday");
//        } else {
//            System.out.println("Not a valid day");
//        }

        switch (dayNumber) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Not a valid day");
        }

    }

}
