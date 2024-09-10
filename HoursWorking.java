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

            int hours = getWorkHours(attendance, workType);
            int dailyWage = 0;

            if (attendance == 1) {
                sw

