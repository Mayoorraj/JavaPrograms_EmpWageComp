package com.bridgelabz.assignment4.EmpWageComp;

/**
 * @author mayoor
 *
 */
public class EmpWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation program..!");
//		checking whether employee is present 
		int isPartTime = 1;
		int isFullTime = 2;
		int empRatePerHour = 20;
		int empHrs = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
// 		Check Present Employee is Part time or Full time
		
		if (empCheck == isPartTime) {
			empHrs = 4;
			System.out.println("\nEmployee is present, working part time..");
		} 
		if (empCheck == isFullTime) {
			empHrs = 8;
			System.out.println("\nEmployee is present, working full time..");
		}
		if (empCheck==0) {
			empHrs = 0;
		System.out.println("\nEmployee is absent..");
	}
		
		empWage = empHrs * empRatePerHour;
		System.out.println("Employee Wages will be : " + empWage + " INR");
	}
}