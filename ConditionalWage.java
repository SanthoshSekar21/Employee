import java.util.Random;

public class ConditionalEmployeeWageComputation {

    // Constants
    private static final int FULL_TIME_HOURS = 8;
    private static final int PART_TIME_HOURS = 8;
    private static final int FULL_TIME_RATE = 20;  // Rate per hour for full-time employees
    private static final int PART_TIME_RATE = 10;  // Rate per hour for part-time employees
    private static final int MAX_HOURS = 100; // Maximum working hours
    private static final int MAX_DAYS = 20; // Maximum working days

    public static void main(String[] args) {
        Random random = new Random();
        
        int totalWage = 0;
        int totalHours = 0;
        int totalDays = 0;
        int presentDays = 0;
        int absentDays = 0;

        while (totalHours < MAX_HOURS && totalDays < MAX_DAYS) {
            totalDays++;
            int attendance = random.nextInt(2); // 0 for Absent, 1 for Present
            int workType = random.nextInt(2); // 0 for Full-Time, 1 for Part-Time

            int hours = 0;
            int dailyWage = 0;

            System.out.print("Day " + totalDays + ": ");

            if (attendance == 1) {
                switch (workType) {
                    case 0:
                        // Full-Time
                        hours = FULL_TIME_HOURS;
                        dailyWage = hours * FULL_TIME_RATE;
                        System.out.println("Employee is Present. Full-Time. Worked " + hours + " hours. Daily Wage: $" + dailyWage);
                        break;
                    
                    case 1:
                        // Part-Time
                        hours = PART_TIME_HOURS;
                        dailyWage = hours * PART_TIME_RATE;
                        System.out.println("Employee is Present. Part-Time. Worked " + hours + " hours. Daily Wage: $" + dailyWage);
                        break;

            

