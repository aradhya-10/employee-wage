import java.util.*;

public class EmployeeWage {
	
	public static final int WAGE_RATE = 20;
	public static void main(String[] args) {
		System.out.println("Employee Attendance");
		
		int empWage = 0;
		int workHours = 0;
		double isPartTime = Math.floor(Math.random() * 10) % 2;;
		double isPresent = Math.floor(Math.random() * 10) % 2;

		if (isPresent == 1) {
			if(isPartTime == 1){
				workHours = 8;
				System.out.print("Fulltime ");
			}
			else{
				workHours = 2;
				System.out.print("Part-time ");
			}
			System.out.println("Employee is Present");
		}
		else
			System.out.println("Employee is Absent");
			
		empWage = workHours * WAGE_RATE;
		System.out.println("Employee Wage is: "+empWage);
	}
}