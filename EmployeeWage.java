import java.util.*;

public class EmployeeWage {
	
	int wageRate;
	int workingDays;
	int maxWorkingHours;

	EmployeeWage(int wageRate, int workingDays, int maxWorkingHours){
		this.wageRate = wageRate;
		this.workingDays = workingDays;
		this.maxWorkingHours = maxWorkingHours;
	}

	int calcDailyWorkHours(int empType){
		int workHours = 0;
		switch (empType){
			case 1:
				System.out.println("Employee is Present Fulltime");
				workHours = 8;
				break;
			case 2:
				System.out.println("Employee is Present Part-time");
				workHours = 2;
				break;
			default:
				workHours = 0;
				System.out.println("Employee is Absent");
			}
		return workHours;
	}

	void calculateTotalWage(){
		System.out.println("Employee Attendance");
		
		int empWage = 0;
		int workHours = 0;
		int totalWorkHours = 0;
		int totalPresentDays = 0;
		
		while(totalWorkHours<=maxWorkingHours && totalPresentDays<=workingDays){
			totalPresentDays++;
			double empType = Math.floor(Math.random() * 10) % 3;
			workHours = calcDailyWorkHours((int)empType);
			totalWorkHours += workHours;
		}
		
		empWage = totalWorkHours * wageRate;
		System.out.println("Total Employee Wage for the month is: "+empWage);
	}
	public static void main(String[] args) {
		EmployeeWage E1 = new EmployeeWage(20, 20, 100);
		EmployeeWage E2 = new EmployeeWage(22, 20, 120);
		// EmployeeWage E3 = new EmployeeWage(25, 26, 80);

		System.out.println("Company 1\n");
		E1.calculateTotalWage();
		System.out.println("Company 1\n");
		E2.calculateTotalWage();
	}
}