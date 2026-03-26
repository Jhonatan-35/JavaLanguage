import java.util.Scanner;

public class ValueNumbers {
	
	public static void main(String[]ar) {
		
		Scanner Keyboard = new Scanner (System.in);
		
		int num1 ,num2 ,num, num3, num4;
		int sum,survey;
		System.out.print("Enter the first value:");
		num1 = Keyboard.nextInt();
		
		System.out.print("Enter the second value:");
		num2 = Keyboard.nextInt();
		
		System.out.print("Enter the third value:");
		num3 = Keyboard.nextInt();
		
		System.out.print("Enter the fourth value:");
		num4 = Keyboard.nextInt();
		
		sum = num1 + num2 +num3 +num4;
		
		survey = sum /4;
		
		System.out.print("The sum of the number is :");
		System.out.println(sum);
		
		
		System.out.print("The survey of the number is :");
		System.out.println(survey);
		
	}

}
