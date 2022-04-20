package com.bridgelabz.assignment4.EmpWageComp;

/**
 * @author mayoor
 *
 */
public class EmpWageComputation {
	public static final int FULL_TIME = 1;
	public static final int PART_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;
	public static final int NUM_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem Part3!");

		int empHrs = 0, empWage = 0, totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 1;

		// check total emp hour not more than 100 and total days not more than 20
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <= NUM_WORKING_DAYS) {

			double empCheck = Math.floor(Math.random() * 3);

			switch ((int) empCheck) {
			case FULL_TIME:
				System.out.println("\nEmployee is present, working full time");
				empHrs = 8;
				break;

			case PART_TIME:
				System.out.println("\nEmployee is present, working part time");
				empHrs = 4;
				break;

			default:
				System.out.println("\nEmployee is Absent");
				empHrs = 0;
			}

			empWage = empHrs * EMP_WAGE_PER_HR;
			totalEmpWage += empWage;
			totalEmpHrs += empHrs;
			System.out.println("Employee wages for a day is " + empWage + " INR");

			// day increment by 1 every iteration
			totalWorkingDays++;
		}
		System.out.println("\nEmployee had worked for " + totalEmpHrs + " Hrs..");
		System.out.println("Employee will be paid " + totalEmpWage + " INR..!");
	}

}