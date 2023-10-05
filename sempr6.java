import stanford.karel.SuperKarel;

public class sempr6 extends SuperKarel{
	
	public void run(){
		move();
		moveFirstPileToDestinationAndBackup();
		move();
		moveSecondPileToDestinationAndBackup();
	//	moveToSecondPile();
		restoreBeepers();
	//	moveToFirstPile();
		turnAround();
		move();
		turnAround();
		restoreBeepers();
	}

	private void restoreBeepers() {
		turnLeft();
		move();
		turnAround();
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
		move();
		turnLeft();
	}

	private void moveSecondPileToDestinationAndBackup() {
		while(beepersPresent()){
			pickBeeper();
			moveBeeperFromSecondPileToDestinationPile();
			backupBeeper();
		}
		
	}

	private void moveBeeperFromSecondPileToDestinationPile() {
		move();
		putBeeper();
		turnAround();
		move();
		turnAround();
		
	}

	private void moveFirstPileToDestinationAndBackup(){
		while(beepersPresent()){
			pickBeeper();
			moveBeeperFromFirstPileToDestinationPile();
			backupBeeper();
		}
	}

	private void backupBeeper() {
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();	
	}

	private void moveBeeperFromFirstPileToDestinationPile() {
		move();
		move();
		putBeeper();
		turnAround();
		move();
		move();
		turnAround();
		
	}
	
}	
