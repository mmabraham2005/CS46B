package dotlab;

import java.io.*;
import java.lang.String;
import java.lang.Integer;


public class DotReader 
{
	private BufferedReader			br;
	
	public DotReader(BufferedReader br)
	{
		this.br = br;
	}
	public Dot readDot() throws IOException, DotException{
		String dotLine = br.readLine();		
		if(dotLine == null) {
			return null;
		}
		String [] dotArray = dotLine.split(",");
		
		if(dotArray.length != 4) {
			throw new DotException("Too many variables entered.");
		}
		String cName = dotArray[0];
		int x = Integer.parseInt(dotArray[1]);
		int y = Integer.parseInt(dotArray[2]);
		int r = Integer.parseInt(dotArray[3]);
		return new Dot(cName, x, y, r);
	}
	

}
