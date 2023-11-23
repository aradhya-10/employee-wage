import java.util.*;

public class EmployeeWage {
	
	public static final int WAGE_RATE = 20;
	public static final int WORKING_DAYS = 20;
	public static final int MAX_WORKING_DAYS = 20;
	public static final int MAX_WORKING_HOURS = 100;

	public static void main(String[] args) {
		System.out.println("Employee Attendance");
		
		int empWage = 0;
		int workHours = 0;
		int totalWorkHours = 0;
		int totalPresentDays = 0;
		
		while(totalWorkHours<=MAX_WORKING_HOURS && totalPresentDays<=MAX_WORKING_DAYS){
			totalPresentDays++;
			double empType = Math.floor(Math.random() * 10) % 3;
			switch ((int)empType){
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
			totalWorkHours += workHours;
		}
		
		empWage = totalWorkHours * WAGE_RATE;
		System.out.println("Total Employee Wage for the month is: "+empWage);
	}
}