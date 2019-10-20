public class Challange {

    static void printDayOfThe_WEEK(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Teusday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    static void printDayOfThe_WEEK2(int day) {
        if (day == 1) {
            System.out.println("\tMonday");
        } else if (day == 2) {
            System.out.println("\tTeusday");
        } else if (day == 3) {
            System.out.println("\tWednesday");
        } else if (day == 4) {
            System.out.println("\tThursday");
        } else if (day == 5) {
            System.out.println("\tFriday");
        } else if (day == 6) {
            System.out.println("\tSaturday");
        } else if (day == 0) {
            System.out.println("\tSunday");
        } else
            System.out.println("\tInvalid day");

    }

    static void printNumberInWord(int number){

        switch (number){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            case 0:
                System.out.println("ZERO");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }


    public static void main(String[] args) {
        System.out.println("\n\nwersja pierwsza:\n");
        printDayOfThe_WEEK(3);
        printDayOfThe_WEEK(0);
        printDayOfThe_WEEK(7);

        System.out.println("\n\nwersja druga:");
        printDayOfThe_WEEK2(3);
        printDayOfThe_WEEK2(0);
        printDayOfThe_WEEK2(7);

        System.out.println("Number in WORD");
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(-2);
    }
}
