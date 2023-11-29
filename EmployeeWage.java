// import java.util.*;

import java.util.ArrayList;
import java.util.List;

interface EmployeeWageInterface {
	int calcDailyWorkHours(int empType);
	void calcAllEmpWages();
}

class CompanyEmpWage {
		
	final String companyName;
	final int wageRate;
	final int workingDays;
	final int maxWorkingHours;
	int totalEmpWage;

	CompanyEmpWage(String companyName, int wageRate, int workingDays, int maxWorkingHours){
		this.companyName = companyName;
		this.wageRate = wageRate;
		this.workingDays = workingDays;
		this.maxWorkingHours = maxWorkingHours;
		this.totalEmpWage = 0;
	}

	public void setTotalEmpWage(int wage){
		this.totalEmpWage = wage;
	}

	public void displayTotalWage(){
		System.out.println("Total Wage for " + this.companyName + " for the month is: " + this.totalEmpWage);
	}
}
public class EmployeeWage implements EmployeeWageInterface{
	
	List<CompanyEmpWage> companyEmpWages = new ArrayList<>();

	int cIndex=0;

	public void addCompanyEmpWage(String name, int wageRate, int workingDays, int maxWorkingHours){
		CompanyEmpWage c1 = new CompanyEmpWage(name, wageRate, workingDays, maxWorkingHours);
		companyEmpWages.add(c1);		cIndex++;
	};

	@Override
	public int calcDailyWorkHours(int empType){
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

	void calculateTotalWage(CompanyEmpWage company){
		System.out.println("Employee Attendance");
		
		int empWage = 0;
		int workHours = 0;
		int totalWorkHours = 0;
		int totalPresentDays = 0;
		
		while(totalWorkHours<=company.maxWorkingHours && totalPresentDays<=company.workingDays){
			totalPresentDays++;
			double empType = Math.floor(Math.random() * 10) % 3;
			workHours = calcDailyWorkHours((int)empType);
			totalWorkHours += workHours;
		}
		
		empWage = totalWorkHours * company.wageRate;
		company.setTotalEmpWage(empWage);
		company.displayTotalWage();
	}

	@Override
	public void calcAllEmpWages() {
		for(CompanyEmpWage companyEmpWage: companyEmpWages) {
			this.calculateTotalWage(companyEmpWage);
		}
	}

	public static void main(String[] args) {
		EmployeeWage E1 = new EmployeeWage();
		E1.addCompanyEmpWage("Company3", 25, 26, 80);
		E1.addCompanyEmpWage("Company3", 25, 26, 80);
		E1.calcAllEmpWages();
	}
}