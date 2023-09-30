package transport;

public class MarsRover extends UnmannedVehicle {

	public MarsRover() {
		System.out.println("MarsRover ctor");
	}
	public static void main(String[] args) 
	{ 
		Vehicle v = new Vehicle(5); 
		UnmannedVehicle u = new UnmannedVehicle();
		MarsRover m = new MarsRover();
		
	}

}
