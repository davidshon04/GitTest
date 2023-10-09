import stanford.karel.Karel;

//9. კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

public class Problem09att1 extends Karel{

	public void run(){
		move();
		createTable();
		bringBackStartingBeepers();
		putMultipliedBeepers();
	}
	
	private void createTable(){
		while(beepersPresent()){
			carryNBeepersAndDoubleMBeepers();
			bringUpperBeepersBack();
		}	
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
	
	private void carryNBeepersAndDoubleMBeepers(){
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
		turnAround();
		move();
		move();
		turnRight();
		move();
		turnAround();
	}
	
	private void bringBackStartingBeepers(){
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
	
	private void putMultipliedBeepers(){
		for(int i=0; i<2; i++){
			turnLeft();
			move();
		}
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
