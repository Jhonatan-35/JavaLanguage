import java.util.Scanner;

public class ShopingCar {
	
	public static void main (String[]arg) {
		
		
	       Scanner Keyboard = new Scanner(System.in);
	       
	       float price;
	       int quantity;
	       float important;
	    
	       System.out.print("Enter the price of the item :");
	       price = Keyboard.nextFloat();
	       
	       
	       System.out.print("Enter the quanty of the items :");
	       quantity = Keyboard.nextInt();
	       
	       important =price * quantity;
	       
	       System.out.print("The important is  :");
	       System.out.print(important);
	       
	       
	}

}
