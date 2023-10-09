import stanford.karel.Karel;

//9. კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

public class Problem09att1 extends Karel{

	public void run(){
		move();
		while(beepersPresent()){
			carryBeeperFromNBeepersAndDoubleMBeepers();
			bringUpperBeepersBack();
			goTo2X1();
		}
		bringBackNBeepersFrom4X1();
		bringMultipliedBeepersToDestination();
	}
	
	
	private void turnAround(){
		turnLeft();
		turnLeft();
	}
	
	private void turnRight(){
		for(int i=0; i<3; i++){
			turnLeft();
		}
	}
	
	private void carryBeeperFromNBeepersAndDoubleMBeepers(){
		while(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			turnRight();
			doubleMBeepers();
		}
	}
	
	private void doubleMBeepers(){
		while(beepersPresent()){
			pickBeeper();
			for(int i=0; i<2; i++){
				move();
				putBeeper();
			}
			turnAround();
			move();
			move();
			turnAround();
		}
	}
	
	private void bringUpperBeepersBack(){
		move();
		move();	
		while(beepersPresent()){
			turnAround();
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();	
		}	
	}
	
	private void goTo2X1(){
		turnAround();
		move();
		move();
		turnRight();
		move();
		turnAround();
	}
	
	private void bringBackNBeepersFrom4X1(){
		move();
		move();
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
		}
	}
	
	private void bringMultipliedBeepersToDestination(){
		goToMultipliedBeepers();
		bringThemToDestination();
	}
	
	private void goToMultipliedBeepers(){
		for(int i=0; i<2; i++){
			turnLeft();
			move();
		}
	}
	
	private void bringThemToDestination(){
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			turnRight();
			move();
			putBeeper();
			turnAround();
			move();
			turnLeft();
			move();
		}
	}
}
