import java.util.Scanner;


public class QuotientExceptionExample {


	public static void main(String[] args) {
		
		String response = "";
		int numerator;
		int denominator;
		int result = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			try {
				
			System.out.println("Enter a numerator integer:");
			numerator = input.nextInt();
			
			System.out.println("Enter a denominator integer. It must not be 0:");
			denominator = input.nextInt();
			
			result = numerator/denominator;
			
			System.out.println(numerator + "/" + denominator + "=" + result);
			
			}
			catch(ArithmeticException ex) {
				System.out.println("You must not enter 0 for denominator.");
				System.out.println("Do you want to try again?");
				System.out.println("Type Yes or No:");
				response = input.next();
				
			}
			
		}while(response.toLowerCase().contains("y"));
		
		System.out.println("Goodbye!");

	}
	


}
