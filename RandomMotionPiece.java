package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;
import java.util.Random;
public abstract class RandomMotionPiece extends GamePiece implements Moveable, Drawable {
	private Random rand = new Random();
	public RandomMotionPiece(char symbol, String name, int location) {
		super(symbol, name, location);
		// TODO Auto-generated constructor stub
	}
	//random motion- dog and building
	public void move(Drawable[] gameBoard, int playerLocation) {
		int oldLocation = getLocation();
		int newLocation = rand.nextInt(21);
		while (gameBoard[newLocation] != null) {
			newLocation = rand.nextInt(21);
		}
		setLocation(newLocation);
		gameBoard[newLocation] = this;
		gameBoard[oldLocation] = null;
	}

}
