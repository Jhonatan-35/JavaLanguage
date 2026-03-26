import java.util.Scanner;

public class PerimeterSquare {

	public static void main(String[]ar) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int side;
		int perimeter;
		
		System.out.print("Enter the value of side: ");
		side=keyboard.nextInt();
	    perimeter = side *4;
		
		System.out.print("The perimeter of the square is: ");
		System.out.print(perimeter);
	
	}
}
