import java.util.Random;
import java.util.Scanner;

public class empWageComputation {

    // Constants
    private static final int FULL_TIME_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;
    private static final int FULL_TIME_RATE = 20;
    private static final int PART_TIME_RATE = 10;
    private static final int WORK_DAYS_PER_MONTH = 20;

    // Method to calculate daily wage
    private static int calculateDailyWage(int hours, int rate) {
        return hours * rate;
    }

    // Method to simulate work days
    private static void simulateWorkDays(int workDays) {
        Random random = new Random();
        int totalWage = 0;
        int totalHours = 0;
        int totalDays = 0;

        for (int day = 1; day <= workDays; day++) {
            // Randomly choose between full-time, part-time, or no work
            int employeeType = random.nextInt(3);
            int hours = 0;
            int rate = 0;

            switch (employeeType) {
                case 0:
                    hours = FULL_TIME_HOURS;
                    rate = FULL_TIME_RATE;
                    break;
                case 1:
                    hours = PART_TIME_HOURS;
                    rate = PART_TIME_RATE;
                    break;
                default:
                    hours = 0;
                    rate = 0;
                    break;
            }

            int dailyWage = calculateDailyWage(hours, rate);
            totalWage += dailyWage;
            totalHours += hours;
            if (hours > 0) {
                totalDays++;
            }
        }

        // Output the results
        System.out.println("Total Wage: $" + totalWage);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Total Work Days: " + totalDays);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Employee Wage Computation Program!");

        // Get number of work days from the user
        System.out.print("Enter the number of work days in a month: ");
        int workDays = scanner.nextInt();

        // Validate input
        if (workDays < 0 || workDays > WORK_DAYS_PER_MONTH) {
            System.out.println("Invalid input. Please enter a number between 0 and " + WORK_DAYS_PER_MONTH);
            scanner.close();
            return;
        }

        // Simulate work days and calculate total wage
        simulateWorkDays(workDays);

        // Close the scanner
        scanner.close();
    }
}

