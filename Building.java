package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Building extends GamePiece {

	public Building(char symbol, String name, int location) {
		super(symbol, name, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(playerLocation == getLocation()) {
			return InteractionResult.GET_POINT;
		}
		else {
			return InteractionResult.NONE;
		}
	}

}
