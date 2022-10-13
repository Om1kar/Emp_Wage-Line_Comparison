package EmployeeWageComputation;

public class EmployeeWageComputation {
    static final int WAGE_PER_HOUR =20;
    static final int FULL_DAY_HOUR =8;
    static final int PART_TIME_HOUR = 4;
    static final int PART_TIME = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int dailyEmployeeWage = 0;
        double empCheck = (int)Math.floor(Math.random()*10)%3;

        if (empCheck==1){
            System.out.println("Employee is Present");
            dailyEmployeeWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Daily Wage of Employee= "+dailyEmployeeWage);

        } else if (empCheck==2) {
            System.out.println("Employee is Present Part Time");
            dailyEmployeeWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Daily Wage of employee in Part Time = "+dailyEmployeeWage);

        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily wage of employee is 0");
        }
    }
}
