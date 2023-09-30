package dotlab;


public class Dot 
{
	private static String[] 	LEGAL_COLOR_NAMES =
	{
		"RED", "YELLOW", "BLUE", "CYAN", "GREEN", "MAGENTA", "ORANGE", "BLACK"
	};
	private String colorName;
	private int x;
	private int y;
	private int radius;
	
	public Dot(String colorName, int x, int y, int radius)throws IllegalArgumentException  {
		boolean isGoodName = false;
		for(int i = 0; i < LEGAL_COLOR_NAMES.length; i++) {
			if(LEGAL_COLOR_NAMES[i].equals(colorName)) {
				isGoodName =  true;
			}
		}
		if(!isGoodName) {
			throw new IllegalArgumentException("This color name is bad.");
		}
		
		this.colorName = colorName;
		this.x = x;
		this.y = y;
		this.radius = radius;	
	}
	
	public String getColorName() {
		return colorName;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getRadius() {
		return radius;
	}
	public String toString() {
		return "Dot info: Color = " + colorName 
				+ ", x coord = " + x 
				+ ", y coord = " + y 
				+ ", radius = "  + radius;
	}
	
	public static void main(String [] args) {
		
		Dot newDot = new Dot("BLUE", 2 ,3 ,4);
		System.out.println(newDot.toString());
	}
	


}
