package com.bridgelabz.assignment4.EmpWageComp;

import java.util.ArrayList;

/**
 * @author mayoor
 *
 */
public class EmpWageComputation implements EmpWageInterface {
//	global variables
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

//	creating an array list
	private ArrayList<CompanyEmpWage> companyEmpWageArrayList;

//	creating an object of constructor
	public EmpWageComputation() {
		super();
		companyEmpWageArrayList = new ArrayList<CompanyEmpWage>();
	}

//	defining method using array
	public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
		CompanyEmpWage companywage = new CompanyEmpWage(company, empRatePerHr, numOfWorkingDays, maxHrsPerMonth);
		companyEmpWageArrayList.add(companywage);
	}

//	calculating wages for multiple company
	public void empWage() {
		for (int i = 0; i < companyEmpWageArrayList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);

			int totalEmpWage = this.computeEmpWage(companyEmpWage);
			System.out.println("----------------------------------------------------------"
					+ "\nTotal Employee Wage for Company " + companyEmpWage.company + " is " + totalEmpWage
					+ " INR\n-----------------------------------------------------------");
		}
	}

//	calculating wages for a company
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int totalEmpHour = 0;
		int empHour = 0;
		int totalWorkingDays = 0;

		while (totalEmpHour <= companyEmpWage.maxHrsPerMonth && totalWorkingDays <= companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHour = 8;
				break;

			case IS_PART_TIME:
				empHour = 4;
				break;

			default:
				empHour = 0;
			}
			totalEmpHour += empHour;
			
//			storing daily wages paid by company
			int dailyWage = empHour * companyEmpWage.empRatePerHr;
			
		}
		return companyEmpWage.totalEmpWage = totalEmpHour * companyEmpWage.empRatePerHr;
	}

	public static void main(String[] args) {
//		Welcome message
		System.out.println("Welcome to Employee Wage Computation program..!");

//		Creating instances of array list to compute multiple companies wage structure
		EmpWageComputation companyEmpWageArray = new EmpWageComputation();
		companyEmpWageArray.addCompanyEmpWage("D-Mart", 20, 30, 150);
		companyEmpWageArray.addCompanyEmpWage("Big Basket", 25, 30, 200);
		companyEmpWageArray.addCompanyEmpWage("Reliance Mart", 22, 30, 300);
// 		calling method to compute wages for multiple companies
		companyEmpWageArray.empWage();

	}
}