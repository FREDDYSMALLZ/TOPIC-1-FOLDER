import java.util.Scanner;
public class Chapter2Exercise {

	public static void main(String args []){
		
		Scanner input = new Scanner(System.in);
	//Calculation of interest
		//Obtaining input from the question for financial application
		
		System.out.print(" Enter balance and interest rate: ");
		// Interest = balance * (annual Interest rate / 1200) formula is given
		
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;
		double interest = balance * monthlyInterestRate;
		
		//Display output to the console
		System.out.println("The balance is rate is " + (int)(100 * interest) / 100.0);
		
		
		

	}

}
