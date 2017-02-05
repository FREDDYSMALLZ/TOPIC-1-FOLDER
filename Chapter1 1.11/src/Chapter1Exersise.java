
public class Chapter1Exersise {

	public static void main(String[] args) {
		// Population projection based on the following assumptions
		// One birth every 7 second
		// One death every 13 seconds
		// One new immigrant every 45 seconds
		
		double currentPopu = 312032486;
		double time = 5;
		double birth;
	    double death;
	    double immigrant;
		double newPopu;
		
			  
		   // Convert time to seconds
		  // Given that 1 year is 365 days
	     //  Find the number of seconds(Time) in a whole year
	    //   1 day = 24 hours; 1 hour = 60 minutes; 1 minute = 60 Seconds
			  
		   time = 365 * 24 * 60 * 60;
		   
		   // Calculating population change from the above assumptions.
		   // Number of birth, death and immigrant
		   
		   birth = time / 7.0;
		   death = time / 13.0;
		   immigrant = time / 45.0;
		   
		   // calculate new population
		   
		   newPopu = currentPopu + birth - death + immigrant;
		   System.out.println("The population " + " is " + newPopu);

		  }
	}



