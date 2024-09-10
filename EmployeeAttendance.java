import java.util.Random;

public class EmployeeWageComputation {

    // Constants
    private static final int FULL_TIME_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;
    private static final int FULL_TIME_RATE = 20; // Rate per hour
    private static final int PART_TIME_RATE = 10; // Rate per hour
    private static final int WORK_DAYS = 30; // Number of days to simulate

    public static void main(String[] args) {
        Random random = new Random();
        int totalWage = 0;
        int totalHours = 0;
        int presentDays = 0;
        int absentDays = 0;

        for (int day = 1; day <= WORK_DAYS; day++) {
            int attendance = random.nextInt(2); // 0 for Absent, 1 for Present
            
            // Simulate different work types
            int workType = random.nextInt(3); // 0 for Full-Time, 1 for Part-Time, 2 for No Work
            int hours = 0;
            int dailyWage = 0;

            if (attendance == 1) {
                if (workType == 0) {
                    hours = FULL_TIME_HOURS;
                    dailyWage = hours * FULL_TIME_RATE;
                } else if (workType == 1) {
                    hours = PART_TIME_HOURS;
                    dailyWage = hours * PART_TIME_RATE;
                } else {
                    // No work type (could be a holiday or off day)
                    dailyWage = 0;
                }
                
                totalWage += dailyWage;
                totalHours += hours;
                presentDays++;
            } else {
                absentDays++;
            }

            System.out.print("Day " + day + ": ");
            if (attendance == 1) {
                System.out.println("Employee is Present. Worked " + hours + " hours. Daily Wage: $" + dailyWage);
            } else {
                System.out.println("Employee is Absent.");
            }
        }

        // Print the summary
        System.out.println("\nSummary:");
        System.out.println("Total Wage: $" + totalWage);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Total Present Days: " + presentDays);
        System.out.println("Total Absent Days: " + absentDays);
    }
}

