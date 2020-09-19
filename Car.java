package levelPieces;
import java.lang.Math;
import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Car extends GamePiece implements Drawable{

	public Car(char symbol, String name, int location) {
		super(symbol, name, location);
		// TODO Auto-generated constructor stub
	}
	//kill if player is on the same square or beside it
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(Math.abs(playerLocation - getLocation()) <= 1) {
			return InteractionResult.KILL;
		}
		else {
			return InteractionResult.NONE;
		}
	}

}
