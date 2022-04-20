package com.bridgelabz.assignment4.EmpWageComp;

/**
 * @author mayoor
 *
 */
public class EmpWageComputation {
	// Declared global variables
	public static final int ABSENT = 0;
	public static final int IS_PRESENT = 1;
	public static final int IS_HALF_PRESENT = 2;
	public static final int WAGE_PER_HR = 20;
	public static final int NUM_OF_WORKING_DAY = 20;
	public static final int MAX_WORKING_HR = 100;

	public static void main(String[] args) {
		// Print Program Name
		System.out.println("\nWelcome to Employee Wage Computation Program");

		// Declared local variables
		int DailyWage = 0;
		int EmpHr = 0;
		int TotalEmpWage = 0;
		int TotalEmpHrs = 0;
		int NoWorkingDay = 0;

		while (TotalEmpHrs <= MAX_WORKING_HR && NoWorkingDay < NUM_OF_WORKING_DAY) {
			NoWorkingDay++;
			double RANDOM = Math.floor(Math.random() * 3);
			// Employee Wage Calculation as per Present, Absent Or Half Time By using Switch
			switch ((int) RANDOM) {

			case 0:
				System.out.println("\nEmployee is Absent");
				EmpHr = 0;
				break;

			case 1:
				System.out.println("\nEmployee is Present, working full time..");
				EmpHr = 8;
				break;

			case 2:
				System.out.println("\nEmployee is present, working part time..");
				EmpHr = 4;

			}
			// Calculate Daily Employee Wage
			DailyWage = WAGE_PER_HR * EmpHr;
			TotalEmpWage += DailyWage;
			TotalEmpHrs += EmpHr;
			System.out.println("Employee Wage: " + DailyWage);

		}
		System.out.println("\nEmployee Worked for " + TotalEmpHrs + " Hrs..!");
		System.out.println("Employees monthly Wages will be " + TotalEmpWage + " INR");
		
	}

}