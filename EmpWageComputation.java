package com.bridgelabz.assignment4.EmpWageComp;

/**
 * @author mayoor
 *
 */
public class EmpWageComputation {
	//declared global variables
		public static final int FULL_TIME = 1;
		public static final int PART_TIME = 2;
		public static final int EMP_WAGE_PER_HR = 20;
		
		//method: employee wage calculation	
		public static void empWageComputation(String company, int empWagePerHr, int workingDayPerMonth, int maxHrsInMonth){
				//variables initialization
				 int empHrs = 0, totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 1 ;

				  //check total emp hour not more than 100 and total days not more than 20
			while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays <= workingDayPerMonth){
				   double empCheck = Math.floor(Math.random()*3);
				
				        switch ((int)empCheck){
						  case FULL_TIME:
						       System.out.println("\nEmployee is present Full Time");
						       empHrs = 8;
						       break;
						       
						  case PART_TIME:
						       System.out.println("\nEmployee is present Part Time");
						       empHrs = 4;
						       break;
						  
						  default:
						       System.out.println("\nEmployee is Absent");
						       empHrs = 0;	
				        }
				        
				   //calculate total emp hours
		                   totalEmpHrs += empHrs;
				   System.out.println("Day : "+ totalWorkingDays +" Emp Hrs : "+empHrs);
			       
			        
			      	   //day increment by 1 every iteration
			           totalWorkingDays++ ;
				}
				 // calculate total emp wage
				  totalEmpWage = totalEmpHrs * empWagePerHr;
			          System.out.println("\nTotal Hours work done by Employee of "+company+" in a month is " + totalEmpHrs+ " Hrs"); 
			          System.out.println("Employee of " +company +" is paid " +totalEmpWage+" INR\n---------------------------------" );
			}
		
		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation Problem Part3!");
			
			//method call
			EmpWageComputation.empWageComputation("WIPRO", 25, 5, 25);
			EmpWageComputation.empWageComputation("COGNIZENT", 25, 15, 25);
	   }     
}