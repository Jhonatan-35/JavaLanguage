import java.util.Scanner;

public class IntegersNumbers {
	
    public static void main (String[]arg) {
    	
    	Scanner Keyboard = new Scanner (System.in);
    	
    	int num1,num2,num3,num4;
    	int sum, product;
    	
        System.out.print("Enter the first number:");
        num1 = Keyboard.nextInt();
        
        System.out.print("Enter the second number:");
        num2 = Keyboard.nextInt();
        
        sum = num1 + num2;
        
        System.out.print( "Enter the third number:");
        num3 = Keyboard.nextInt();
        
        System.out.print( "Enter the fourth number:");
        num4 = Keyboard.nextInt();
        
        product = num3 * num4;
        
        System.out.print("The sum of the firs numbers is :");
        System.out.println(sum);
        
        System.out.print("The product of the numbers is :");
        System.out.println(product);
        
    }

}
