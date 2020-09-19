package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import levelPieces.GamePiece;


public class Dog extends RandomMotionPiece implements Drawable, Moveable {
	
	public Dog(char symbol, String name, int location) {
		super(symbol, name, location);
		// TODO Auto-generated constructor stub
	}

	// Advances
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(playerLocation == getLocation()) {
			return InteractionResult.ADVANCE;
		}
		else {
			return InteractionResult.NONE;
		}
	}

}
