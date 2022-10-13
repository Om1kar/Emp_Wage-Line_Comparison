package EmployeeWageComputation;

public class EmployeeWageComputation {
    static final int WAGE_PER_HOUR =20;
    static final int FULL_DAY_HOUR =8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int dailyEmployeeWage = 0;
        double empCheck = (int)Math.floor(Math.random()*10)%2;

        if (empCheck==1){
            System.out.println("Employee is Present");
            dailyEmployeeWage = WAGE_PER_HOUR*FULL_DAY_HOUR;
            System.out.println("Daily Wage of Employee= "+dailyEmployeeWage);
        }
        else {
            System.out.println("Employee is Absent");
            System.out.println("Daily wage of employee is 0");
        }
    }
}
