import java.util.Random;

public class DailyEmployeeWageComputation {

    // Constants
    private static final int FULL_TIME_HOURS = 8;
    private static final int PART_TIME_HOURS = 8;  // Updated to 8 hours
    private static final int FULL_TIME_RATE = 20;  // Rate per hour for full-time employees
    private static final int PART_TIME_RATE = 10;  // Rate per hour for part-time employees
    private static final int WORK_DAYS = 30; // Number of days to simulate

    public static void main(String[] args) {
        Random random = new Random();

        for (int day = 1; day <= WORK_DAYS; day++) {
            int attendance = random.nextInt(2); // 0 for Absent, 1 for Present

            int workType = random.nextInt(2); // 0 for Full-Time, 1 for Part-Time
            int hours = 0;
            int dailyWage = 0;

            if (attendance == 1) {
                if (workType == 0) {
                    hours = FULL_TIME_HOURS;
                    dailyWage = hours * FULL_TIME_RATE;
                    System.out.println("Day " + day + ": Employee is P

