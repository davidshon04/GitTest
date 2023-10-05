import stanford.karel.SuperKarel;

public class sempr6 extends SuperKarel{
	
	public void run(){
		moveFirstPileToDestinationAndBackup();
		moveSecondPileToDestinationAndBackup();
	//	moveToSecondPile();
		restoreBeepers();
	//	moveToFirstPile();
		restoreBeepers();
	}

	private void moveFirstPileToDestinationAndBackUp(){
		while(beepersPresent()){
			pickBeeper();
			moveBeeperFromFirstPileToDestinationPile();
			backupBeeper();
		}
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
