package EmployeeWageComputation;

public class EmployeeWageComputation {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

    static final int PART_TIME = 2;
    static final int FULL_TIME = 1;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int TOTAL_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int monthlyWage = 0;
        int dailyEmployeeWage = 0;
        int workingDays = 0;
        int workingHours = 0;
        int empHours = 0;

        while (workingHours <= TOTAL_WORKING_HOURS && workingDays < WORKING_DAYS_PER_MONTH) {
            workingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case FULL_TIME:
                    System.out.println("Employee is Present");
                    empHours = 8;
                    dailyEmployeeWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    monthlyWage = WAGE_PER_HOUR * FULL_DAY_HOUR * WORKING_DAYS_PER_MONTH;
                    System.out.println("Daily Wage of Employee= " + dailyEmployeeWage);
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Monthly Salary of Employee= " + monthlyWage);
                    break;

                case PART_TIME:
                    System.out.println("Employee is Present Part Time");
                    empHours = 4;
                    dailyEmployeeWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    monthlyWage = WAGE_PER_HOUR * PART_TIME_HOUR * WORKING_DAYS_PER_MONTH;
                    System.out.println("Daily Wage of employee in Part Time = " + dailyEmployeeWage);
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Monthly Salary of Employee in Part Time= " + monthlyWage);
                    break;

                default:
                    empHours =0;
                    System.out.println("Employee is Absent");
                    System.out.println("Daily wage of employee is 0");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Monthly Salary of Employee is 0");
                    break;
            }

            System.out.println("Day-- " + workingDays + " Total Working Hours " + empHours);

            workingHours = workingHours + empHours;
        }
       System.out.println("============================================================================");
            System.out.println("total working hours = " +workingHours);
        System.out.println("Total Emp Wage = " +monthlyWage);

            }
        }


