package com.bridgelabz.assignment4.EmpWageComp;

/**
 * @author mayoor
 *
 */
public class EmpWageComputation {
// 	Declared global variables
	public static final int ABSENT = 0;
	public static final int IS_PRESENT = 1;
	public static final int IS_HALF_PRESENT = 2;
	public static final int WAGE_PER_HR = 20;
	public static final int FULL_DAY_HR = 8;
	public static final int HALF_DAY_HR = 4;
	public static final int NUM_OF_WORING_DAY = 20;
	static int dailyWage = 0;
	static int EmpHr = 0;
	static int totalEmpWage;
	public static double RANDOM;

	public static void main(String[] args) {
// 	Print Program Name
		System.out.println("\nWelcome to Employee Wage Computation Program..!");

		for (int days = 0; days < NUM_OF_WORING_DAY; days++) {
			RANDOM = Math.floor(Math.random() * 3);

// 			Employee Wage Calculation as per Present, Absent Or Half Time By using Switch
			switch ((int) RANDOM) {

			case 0:
				System.out.println("\nEmployee is Absent..");
				EmpHr = 0;
				break;

			case 1:
				System.out.println("\nEmployee is Present, working full time");
				EmpHr = 8;
				break;

			case 2:
				System.out.println("\nEmployee is present, working part time");
				EmpHr = 4;
			}
			
// 			Calculate Daily Employee Wage
			dailyWage = WAGE_PER_HR * EmpHr;
			totalEmpWage += dailyWage;
			System.out.println("Employee Wages for a day will be: " + dailyWage + " INR");
		}
		System.out.println("----------------------------------------------\nTotal Employee Wagese for amonth " + totalEmpWage +
				" INR\n----------------------------------------------");
	}
}