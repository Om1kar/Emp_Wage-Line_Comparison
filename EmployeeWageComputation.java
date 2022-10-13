package EmployeeWageComputation;

public class EmployeeWageComputation {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

    static final int PART_TIME = 2;
    static final int FULL_TIME = 1;
    static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int monthlyWage = 0;
        int dailyEmployeeWage = 0;
        double empCheck =(int)Math.floor(Math.random() * 10) % 3;

        switch ((int)empCheck) {
            case 1:
                System.out.println("Employee is Present");
                dailyEmployeeWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                monthlyWage = WAGE_PER_HOUR * FULL_DAY_HOUR * WORKING_DAYS_PER_MONTH;
                System.out.println("Daily Wage of Employee= " + dailyEmployeeWage);
                System.out.println("------------------------------------------------------------");
                System.out.println("Monthly Salary of Employee= "+ monthlyWage);
                break;

            case 2:
                System.out.println("Employee is Present Part Time");
                dailyEmployeeWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                monthlyWage = WAGE_PER_HOUR * PART_TIME_HOUR * WORKING_DAYS_PER_MONTH;
                System.out.println("Daily Wage of employee in Part Time = " + dailyEmployeeWage);
                System.out.println("------------------------------------------------------------");
                System.out.println("Monthly Salary of Employee in Part Time= "+monthlyWage);
                break;

            default:
                System.out.println("Employee is Absent");
                System.out.println("Daily wage of employee is 0");
                System.out.println("------------------------------------------------------------");
                System.out.println("Monthly Salary of Employee is 0");

        }
    }
}
