
import java.util.Scanner;

public class SquareSurface {

	public  static void main (String[]arg) {
		 Scanner keyboard = new Scanner(System.in);
		 
		 int side;
		 int surface;
		 // This is 
		 System.out.print("Enter the value of side of square :");
		 side = keyboard.nextInt();
		 
		 surface = side*side;
		 
		 System.out.print("The surface of the square  is :");
		 System.out.print(surface);
		 
		 
	}
}
