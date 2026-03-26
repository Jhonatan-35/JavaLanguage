
import java.util.Scanner;

public class OperatorSalary {
	
	public static void main(String[]par){
		
		
		
		Scanner keyboard = new Scanner(System.in);
		
		int hoursWorked;
		float salaryHour;
		float salary;
		
		System.out.print("Enter of the hours working :");
		hoursWorked =keyboard.nextInt();
		
		System.out.print("Enter salary of hour :");
		salaryHour =keyboard.nextFloat();
		
		salary = hoursWorked * salaryHour;
		
		System.out.print("The salary the operator is of : ");
		System.out.print(salary);
	}

}
