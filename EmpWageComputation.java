package com.bridgelabz.assignment4.EmpWageComp;

/**
 * @author mayoor
 *
 */
public class EmpWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation program..!");
//		checking whether employee is present 
		int isPresent = 1;
		int EmpRatePerHour = 20;
		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;

		if (empCheck == isPresent)
			System.out.println("\nEmployee is present !");
		else
			System.out.println("\nEmployee is absent..");

//		calculation employee wage 	
		if (empCheck == isPresent)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EmpRatePerHour;
		System.out.println("Employee wages will be : " + empWage + " INR");
	}
}