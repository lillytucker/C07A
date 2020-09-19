package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import levelPieces.GamePiece;

public class Civilian extends GamePiece implements Drawable, Moveable {
	private  boolean goingR; 
	public Civilian(char symbol, String name, int location) {
		super(symbol, name, location);
		this.goingR = true;
	}
	// hit
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if(playerLocation == getLocation()) {
			return InteractionResult.HIT;
		}else {
			return InteractionResult.NONE;
		}
	}
	// move to the right then moves left when hits the rightmost piece
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		
		int objectLocation = getLocation();
		int oldLocation = getLocation();
		if ((objectLocation < GameEngine.BOARD_SIZE-1) && goingR == true) {
		
			while(gameBoard[objectLocation] != null) {
				if (objectLocation == GameEngine.BOARD_SIZE-1) {
					goingR = false;
					break;
				}
				objectLocation++;
			}
			setLocation(objectLocation);
			gameBoard[getLocation()] = this;
			gameBoard[oldLocation] = null;
			
		}
		if(goingR == false) {
			while(gameBoard[objectLocation] != null) {
				if (objectLocation == 0) {
					goingR = true;
					break;
				}
				objectLocation--;
			}
			setLocation(objectLocation);
			gameBoard[getLocation()] = this;
			gameBoard[oldLocation] = null;
		}
		
	} 

}
