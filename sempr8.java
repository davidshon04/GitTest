import stanford.karel.SuperKarel;

public class sempr8 extends SuperKarel{
	
	public void run(){
		move();
		move();
		while(beepersPresent()){
			substractOneBeeperFromBothPiles();
		}
		moveResultToDestination();
		restoreBeepers();
		move();
		//addResultToFirstPile();
	}

	private void moveResultToDestination() {
		while(beepersPresent()){
			pickBeeper();
			moveBeeperFromFirstPileToDestinationPile();
		}
		
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
	

	private void substractOneBeeperFromBothPiles() {
		pickBeeper();
		backupBeeper();
		turnAround();
		move();
		turnAround();
		pickBeeper();
		backupBeeper();
		move();
	}

}
