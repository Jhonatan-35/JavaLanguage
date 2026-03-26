import java.util.Scanner;

public class AdditionProduct {
	
	public static  void main(String[]ar) {
		Scanner Keyboard =new Scanner (System.in);
		
		int num1 ,num2 ;
		int sum ,product ;
		
		System.out.print("Enter the first value: ");
		num1 = Keyboard.nextInt();
		
	    System.out.print("Enter the second value:");
	    num2 = Keyboard.nextInt();
	    
	    sum = num1 + num2 ;
	   
	    product =num1 * num2 ;
	    
	    System.out.print("The sum of the two values is :");
	    System.out.println(sum);
	    
	    System.out.print("The product of te two values is :");
	    System.out.println(product);
	    
	 
		
		
	}
}
