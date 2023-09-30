package transport;

public class Vehicle {
	
	private int nWheels;
	private double xPosition;
	private double yPosition;
	
	public Vehicle(int wheels) 
	{
		this.nWheels = wheels;
		System.out.println("Vehicle constructor");
	}
	
//	public static void main(String[] args) 
//	{ 
//		Vehicle v = new Vehicle(5); 
//		UnmannedVehicle u = new UnmannedVehicle(5);
//		MarsRover m = new MarsRover(5);
//		
//	}
				
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public double getxPosition() {
		return xPosition;
	}
	public double getyPosition() {
		return yPosition;
	}
	
	public void setPosition(double xPosition, double yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		
	}
	public void changePositionBy(double xDelta, double yDelta) {
		this.xPosition = this.xPosition + xDelta;
		this.yPosition = this.yPosition + yDelta;
		
		
	}


}
