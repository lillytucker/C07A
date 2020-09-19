package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import levelPieces.GamePiece;


public class GrassPiece implements Drawable {
	private char symbol;
	private String name;
	private int location;
	
	public GrassPiece(char symbol, String name, int location) {
	
		this.symbol = symbol;
		this.name = name;
		this.location = location;
		// TODO Auto-generated constructor stub
	}
	public int getLocation() {
		return location;
	}

	@Override
	public void draw() {
		System.out.print(symbol);
	}
}
