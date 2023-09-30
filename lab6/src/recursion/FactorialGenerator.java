package recursion;
import java.lang.Long;

public class FactorialGenerator {

	public double nthFactorial(int n) {
		return computeFactorialRecurse(n);
	}
	
	private double computeFactorialRecurse(int n) {
		
		assert (n >= 0): "This number is below zero.";
		
		if(n == 0) {
			return 1;
		}	
		else{
			return n * computeFactorialRecurse(n - 1);
		}
	}
	public static void main (String [] args) {
		FactorialGenerator factorial = new FactorialGenerator();
		
		//System.out.println(Long.MAX_VALUE);
		//System.out.println(factorial.nthFactorial(-1));
		
		for(int i = 1; i < 33; i++) {
			System.out.println(factorial.nthFactorial(i));
		}
		
	}
}
