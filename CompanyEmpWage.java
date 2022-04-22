package com.bridgelabz.assignment4.EmpWageComp;

public class CompanyEmpWage {
//	local variables
	public String company;
	public int empRatePerHr;
	public int numOfWorkingDays;
	public int maxHrsPerMonth;
	public int totalEmpWage;

//	creating a constructor
	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
		this.company = company;
		this.empRatePerHr = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}

// 	Creating a method for total wage 
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

//	@override
	public String toString() {
		return "\n" + company + " will pay its employee total wage of " + totalEmpWage + " INR";
	}
}