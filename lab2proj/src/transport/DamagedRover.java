package transport;

public class DamagedRover extends MarsRover{
	private final static int MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY  = 3000;
	private final static int METERS_FROM_START_TO_CLIFF = 1000;
	private final static int   N_SIMULATIONS =  500;

	private double metersTraveled = 0; 			// Total meters traveled
											//back and forth.
	private boolean fell = false;           // If true, an expensive loss.
	
	
	//
	// Simulates travel under damage conditions. In each turn, travels forward or
	// backward either 1, 2, 3, or 4 meters. Continues until there's no more power
	// in the battery, or we fall off a cliff. Cliffs are at position = 1000 or
	// position = -1000.
	//
	public void simulateStormDamageTravel()
	{
		
		setPosition(0,0);
		metersTraveled = 0; 	
		fell = false;
	 
		while (metersTraveled < MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY)
		{
			// Random int: 1, 2, 3, or 4. Represents the
			// travel distance (maybe forward, maybe back) this turn
	      double distanceNextTurn = (int)(1 + 4*Math.random());
	      
	  		// Random boolean for direction of travel this turn.
	      boolean forwardNotBack = (Math.random() > 0.5);
	      
	      // Adjust position and metersTraveled.
	      
	      move(distanceNextTurn,forwardNotBack);
	      
	      metersTraveled = metersTraveled + distanceNextTurn;
	      
	      // Check for falling off cliff. If Rover fell, set fell to true and
	      // terminate (break out of) the loop.
	      if (getFell(getxPosition())) 
	      {
		    fell = true;
		    System.out.println("Fell");
		    
		    //TERMINATE THE LOOP
		    return;
	      }
		}
		System.out.println("No more power");
	  }

	public boolean getFell(double position) {
		if(position >= METERS_FROM_START_TO_CLIFF || position <= (METERS_FROM_START_TO_CLIFF * -1)) 
		{
			this.fell = true;
			return this.fell;
		}
		this.fell = false;
		return this.fell;
	}
	private void move(double distance, boolean forward) {
		if(forward) {
			changePositionBy(distance, 0);
		}
		else {
			changePositionBy((distance * -1), 0);
		}
	}

	public double getMetersTraveled() 
	{
		return this.metersTraveled;
	}
	public static void main(String[] args)
	{
		DamagedRover dr = new DamagedRover();
		for (int i = 0; i < N_SIMULATIONS; i++) 
		{
			dr.simulateStormDamageTravel();
		}
	}
}
