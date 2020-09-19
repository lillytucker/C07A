package gameEngine;

import java.util.ArrayList;

import levelPieces.Building;
import levelPieces.Bus;
import levelPieces.Car;
import levelPieces.Cat;
import levelPieces.Civilian;
import levelPieces.Dog;
import levelPieces.GamePiece;
import levelPieces.GrassPiece;
import gameEngine.Moveable;

public class LevelSetup {
	private int levelNum;
	private ArrayList <Moveable> moveablePieces;
	private ArrayList <GamePiece> gamePieces;
	private Drawable[] gameBoard;
	
	public void createLevel(int levelNum) {
		gameBoard= new Drawable[GameEngine.BOARD_SIZE];
		moveablePieces = new ArrayList <Moveable>();
		gamePieces = new ArrayList <GamePiece>();
		for(int i = 0; i < GameEngine.BOARD_SIZE; i++) {
			gameBoard[i] = null;
		}
		if (levelNum == 1) {
			// creates grass piece
			GrassPiece grass = new GrassPiece('g', "Grass", 5);
			gameBoard[grass.getLocation()] = grass;
			
			// creates civilian piece
			Civilian civilian = new Civilian('C', "Civilian", 7);
			gamePieces.add(civilian);
			gameBoard[civilian.getLocation()] = civilian;
			moveablePieces.add(civilian);
			
			// creates dog piece
			Dog dog = new Dog('D', "Dog", 9);
			gamePieces.add(dog);
			moveablePieces.add(dog);
			gameBoard[dog.getLocation()] = dog;
			
			//creates car object vehicle
			Car vehicle = new Car('V', "Vehicle", 20);
			gamePieces.add(vehicle);
			gameBoard[vehicle.getLocation()] = vehicle;
			
			//creates bus piece
			Bus bus = new Bus(11);
			gamePieces.add(bus);
			gameBoard[bus.getLocation()] = bus;
			
			//creates building object store
			Building store = new Building('S', "Store", 17);
			gamePieces.add(store);
			gameBoard[store.getLocation()] = store;
			
			//create Cat object feline
			Cat feline = new Cat('F', "feline", 16);
			gamePieces.add(feline);
			gameBoard[feline.getLocation()] = feline;
			moveablePieces.add(feline);
			
			//pieces.add(grass);
		}
		else {
			for(int i = 0; i < GameEngine.BOARD_SIZE; i++) {
				gameBoard[i] = null;
			}
			GrassPiece grass = new GrassPiece('g', "Grass", 9);
			gameBoard[grass.getLocation()] = grass;
			
			// creates civilian piece
			Civilian civilian = new Civilian('C', "Civilian", 5);
			gamePieces.add(civilian);
			gameBoard[civilian.getLocation()] = civilian;
			moveablePieces.add(civilian);
			
			// creates dog piece
			Dog dog = new Dog('D', "Dog", 12);
			gamePieces.add(dog);
			moveablePieces.add(dog);
			gameBoard[dog.getLocation()] = dog;
			
			//creates car object vehicle
			Car vehicle = new Car('V', "Vehicle", 4);
			gamePieces.add(vehicle);
			gameBoard[vehicle.getLocation()] = vehicle;
			
			// creates another Car object vehicle2
			Car vehicle2 = new Car('V', "Vehicle", 18);
			gamePieces.add(vehicle2);
			gameBoard[vehicle2.getLocation()] = vehicle2;
			
			//creates bus piece
			Bus bus = new Bus(11);
			gamePieces.add(bus);
			gameBoard[bus.getLocation()] = bus;
			
			//creates building object store
			Building store = new Building('S', "Store", 15);
			gamePieces.add(store);
			gameBoard[store.getLocation()] = store;
			
			//create Cat object feline
			Cat feline = new Cat('F', "feline", 16);
			gamePieces.add(feline);
			gameBoard[feline.getLocation()] = feline;
			moveablePieces.add(feline);
			
			
		}
	}
	public Drawable[] getBoard() {
		return gameBoard;
	}
	public ArrayList<Moveable> getMovingPieces() {

		return moveablePieces;
	}
	public ArrayList<GamePiece> getInteractingPieces() {
	
		return gamePieces;
	}
	public int getPlayerStartLoc() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
