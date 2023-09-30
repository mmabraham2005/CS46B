package recursion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FibGenerator {

	public int nthFib(int n) {
		return computeFibRecurse(n);	
	}
	
	private int computeFibRecurse(int n) {
		
		if(n == 1 || n == 2) {
			return 1;
		}
		else {
			int first = computeFibRecurse(n-1);
			int second = computeFibRecurse(n-2);
			return first + second;
		}

	}
	
	
	public static void main (String [] args) {
		
		Logger.getGlobal().setLevel(Level.OFF);
		System.out.println("STARTING");
		FibGenerator generator = new FibGenerator();
		
		int n = 45;
		Logger.getGlobal().info("Entering fib. n=" + n);
		int num = generator.nthFib(n);
		Logger.getGlobal().info("Exiting fib. return=" + num);
	}
}
