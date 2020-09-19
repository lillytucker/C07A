package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Bus extends GamePiece {

	public Bus(int location) {
		super('B', "Bus", location);
		
	}
	// kills player if it comes within 3 spaces and there isn't another object in the middle blocking
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		boolean objectInBetween = false;
		if(Math.abs(playerLocation - getLocation()) <= 2) {
			if(playerLocation < getLocation()) {
				
				for(int i = playerLocation + 1; i < getLocation(); i++) {
					if(gameBoard[i]!= null) {
						objectInBetween = true;
						System.out.println(1);
					}
				}
			}
			if(playerLocation > getLocation()) {
				for(int i = playerLocation-1; i > getLocation(); i--) {
					if(gameBoard[i] != null) {
						objectInBetween = true;
					}
				}
			}
			if(objectInBetween == false) {
				return InteractionResult.KILL;
			}
			else {
				return InteractionResult.NONE;
			}
		}
		
		else {
			return InteractionResult.NONE;
		}
}
	
}
