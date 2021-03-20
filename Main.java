
public class Main {

	public static void main(String[] args) {
		
		calculate(20, 7, 0.4);
	}
	
	
	
	public static void calculate(int numOfTests, int numberOfSuccesses, double probabilityOfSuccess) {
		double ans =0;
		double sum = 0;
		for(int i = numberOfSuccesses; i < numOfTests; i++) {
			 sum = (float)  ( (factorial(numOfTests)) / ((factorial(i))*factorial((numOfTests-i))) 
					* (Math.pow(probabilityOfSuccess,i)) * (Math.pow( (1-probabilityOfSuccess),(numOfTests-i) )  ) );
			System.out.println("PROBABILITY OF IT OCCURING " + i + " TIMES = " + sum);
			ans = sum + ans;
			//System.out.println("PROBABILITY OF IT OCCURING ATLEAST " + i + " TIMES = "  +ans);
		}
		sum = (Math.pow(probabilityOfSuccess,numOfTests)) * (Math.pow( (1-probabilityOfSuccess),(numOfTests-numOfTests) )  );
		System.out.println("PROBABILITY OF IT OCCURING " + numOfTests + " TIMES = " + sum);
		ans = sum + ans;
		System.out.println("PROBABILITY OF IT OCCURING ATLEAST " + numOfTests + " TIMES ="  +ans);
		
		DecimalFormat df = new DecimalFormat("0.####");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		double d = ans;
		
		System.out.println("The answer rounded to 4 decimal places is " + df.format(d));
		
	}
	
	
	public static long factorial(int n) {
	    if (n <= 2) {
	        return n;
	    }
	    return n * factorial(n - 1);
	}
			
			
}


