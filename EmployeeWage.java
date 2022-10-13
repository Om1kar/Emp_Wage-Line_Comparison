package EmployeeWage;
public class EmployeeWage {
           static final int WAGE_PER_HOUR = 20;
           static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        int dailyEmployeeWage = 0;
        double empCheck = Math.floor(Math.random()*10)%2;
            if (empCheck==1){
                System.out.println("Employee is Present");
                dailyEmployeeWage = WAGE_PER_HOUR*FULL_DAY_HOUR;
                System.out.println("Daily wage of employee ="+ dailyEmployeeWage);
            }
            else {
                System.out.println("Employee is Absent");
            }

        }
    }
