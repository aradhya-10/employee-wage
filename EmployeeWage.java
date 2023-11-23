import java.util.*;

public class EmployeeWage {
	
	public static final int WAGE_RATE = 20;
	public static void main(String[] args) {
		System.out.println("Employee Attendance");
		
		int empWage = 0;
		int workHours = 0;
		double empType = Math.floor(Math.random() * 10) % 3;

		switch ((int)empType){
			case 1:
				System.out.println("Fulltime Employee is Present");
				workHours = 8;
				break;
			case 2:
				System.out.println("Part-time Employee is Present");
				workHours = 2;
				break;
			default:
				System.out.println("Employee is Absent");
		}
			
		empWage = workHours * WAGE_RATE;
		System.out.println("Employee Wage is: "+empWage);
	}
}