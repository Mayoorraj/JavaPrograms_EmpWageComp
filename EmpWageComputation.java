package com.bridgelabz.assignment4.EmpWageComp;

/**
 * @author mayoor
 *
 */
public class EmpWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation program..!");
//		checking whether employee is present 
		final int isPartTime = 1;
		final int isFullTime = 2;
		final int empRatePerHour = 20;
		int empHrs = 0;
		int empWage = 0;
		
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
// 		Check Present Employee is Part time or Full time
		
		switch (empCheck) {
		case isPartTime :
			empHrs = 4;
			System.out.println("\nEmployee is present, working part time..");
			break;
		case isFullTime :
			empHrs =8;
			System.out.println("\nEmployee is present, working full time..");
			break;
		default :
			empHrs = 0;
			System.out.println("\nEmployee is absent..");
		}
		
		empWage = empHrs * empRatePerHour;
		System.out.println("Employee Wages will be : " + empWage + " INR");
	}
}