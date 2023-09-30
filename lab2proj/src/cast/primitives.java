package cast;
import java.lang.Byte;
import java.lang.Short;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;


public class primitives {

	public static void dumpMaxValues() {
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
	}
	public static void main(String[] args) {
		
		dumpMaxValues();
		
		// int = long;
		long l = Long.MAX_VALUE;
		int i = (int)l;
		System.out.println("long to int: " + l + ", " + i);
		
		// int = long;
		long newL = Long.MAX_VALUE - 5;
		int j = (int)newL;
		System.out.println("long to int: " + newL + ", " + j);
		
		// long = int;
		int newI = Integer.MAX_VALUE;
		long k = newI;
		System.out.println("int to long: " + newI + ", " + k);
		
		// double = byte;
		byte b = 100;
		double d = b;
		System.out.println("byte to double: " + b + ", " + d);
		
		// byte = double;
		double newD = 45.67;
		byte newB = (byte)newD;
		System.out.println("double to byte: " + newD + ", " + newB);
		
		// byte = double;
		double newD2 = 456.789;
		byte newB2 = (byte)newD;
		System.out.println("double to byte: " + newD2 + ", " + newB2);
		
		// long = float;
		float f = 12345.6789f;
		long newL2 = (long)f;
		System.out.println("float to long: " + f + ", " + newL2);
		
		// long = float;
		float newF = Float.MAX_VALUE;
		long newL3 = (long)f;
		System.out.println("float to long: " + newF + ", " + newL3);
		
		// float = long;
		long newL4 = Long.MAX_VALUE;
		float newF2 = newL;
		System.out.println("long to float: " + newL4 + ", " + newF2);
		
		
		

		
	}
	
	
	
	
	
	
	
}
