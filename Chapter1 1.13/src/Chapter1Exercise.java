
public class Chapter1Exercise {

	public static void main(String[] args) {
		// Solving a 2 by 2 linear equation
		//Solving by using Cramer's rule
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;
		double x;
		double y;
		
		// using the rule( Crammer's rule)
		  
		   
		  x = ( e*d - b*f ) / ( a*d - b*c );
		  y = ( a*f - e*c ) / ( a*d - b*c );
		     // Display results to the console
		  
		  System.out.println(" x is " + x);
		  System.out.println(" y is " + y);
		 

	}

}
