import java.util.*;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Employee Attendance");
		
		double isPresent = Math.floor(Math.random() * 10) % 2;
		if (isPresent == 1) {
			System.out.println("Employee is Present");
		}
		else
			System.out.println("Employee is Absent");
	}
}