import java.util.Scanner;


public class Main {

    static void printCalendar(int firstDay){
        int printBlanks = firstDay - 1;
        int i;

        System.out.println("SUN MON TUE WED THU FRI SAT");
        System.out.println("----------------------------");

        for( i = 0; i < printBlanks; i++){
            System.out.print("    ");
        }
        for( i = 1 ; i <= 8 - firstDay; i++){
            System.out.printf("%-4d", i);
        }

        System.out.println();

        for( i = 9 - firstDay; i <= 31; i++){
            System.out.printf("%-4d", i);

            if((i - (8 - firstDay)) % 7 == 0){
                System.out.println();
            }
        }

        System.out.println("\n");
    }

    public static void main(String[] args) {
        int firstDayOfTheYear;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first day of the year 2021: ");
        firstDayOfTheYear = input.nextInt();

        for(int i = 0; i <= 3; i++){
            System.out.println("\t\tCalendar of " + (2021 + i));
            printCalendar(((firstDayOfTheYear + i  -1 ) % 7) + 1);
        }
    }
}