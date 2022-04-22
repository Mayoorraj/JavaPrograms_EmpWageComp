package com.bridgelabz.assignment4.EmpWageComp;

/**
 * @author mayoor
 *
 */
public class EmpWageComputation {
//	global variables
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
// 	local variable
	private int numOfCompanies = 0;
//	calling constructor
	private CompanyEmpWage[] companyEmpWageArray;

//	creating an object of constructor
	public EmpWageComputation() {
		companyEmpWageArray = new CompanyEmpWage[10];
	}

//	defining method using array
	public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
		companyEmpWageArray[numOfCompanies] = new CompanyEmpWage(company, empRatePerHr, numOfWorkingDays,
				maxHrsPerMonth);
		numOfCompanies++;
	}

//	calculating wages for multiple company
	void empWage() {
		for (int i = 0; i < numOfCompanies; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.print(companyEmpWageArray[i]);
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
		}
		return companyEmpWage.totalEmpWage = totalEmpHour * companyEmpWage.empRatePerHr;
	}

	public static void main(String[] args) {
//		Welcome message
		System.out.println("Welcome to Employee Wage Computation program..!");

//		Creating instances of array to compute multiple companies wage structure
		EmpWageComputation companyEmpWageArray = new EmpWageComputation();
		companyEmpWageArray.addCompanyEmpWage("D-Mart", 20, 30, 150);
		companyEmpWageArray.addCompanyEmpWage("Big Basket", 25, 30, 200);
		companyEmpWageArray.addCompanyEmpWage("Reliance Mart", 22, 30, 300);
// 		calling method to compute wages for multiple companies
		companyEmpWageArray.empWage();

	}

}