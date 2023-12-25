import stanford.karel.Karel;

//10. კარელმა უნდა გაყოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m 
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n / m ბრილიანტი. ჩათვალეთ, რომ n 
//ზუსტად იყოფა m-ზე და კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

public class Problem10att1 extends Karel{
	
	public void run(){
		move();
		while(beepersPresent()){
			firstSubtraction();
			markSubtractionAndStartOver();	
		}
		bringBackNBeepersFrom5X1To2X1();
	}

	private void firstSubtraction(){
		while(beepersPresent()){
			move();
			while(beepersPresent()){
				bringBeeperFrom3X1Up();
				moveTo2X1();	
				carryBeeperFrom2X1To5X1();
				goBackTo3X1();
			}	
		}	
	}
	
	private void bringBeeperFrom3X1Up(){
		pickBeeper();
		turnLeft();
		move();
		putBeeper();
	}
	
	private void moveTo2X1(){
		for(int i=0; i<2; i++){
			turnLeft();
			move();
		}
	}
	
	private void carryBeeperFrom2X1To5X1(){
		pickBeeper();
		turnLeft();
		for(int i=0; i<3; i++){
			move();
		}
		putBeeper();
	}
	
	private void goBackTo3X1(){
		turnAround();
		move();
		move();
		turnAround();
	}
	
	private void markSubtractionAndStartOver(){
		markingSubtraction();
		startTheCycleAgain();
		bringingMBeepersBackTo3X1();
	}
	
	private void markingSubtraction(){
		move();
		putBeeper();
	}
	
	private void startTheCycleAgain(){
		turnAround();
		move();
		move();
		turnAround();
	}
	
	private void turnAround(){
		turnLeft();
		turnLeft();
	}
	
	private void bringingMBeepersBackTo3X1(){
		goTo3X2();
		copyingBackOperation();
		moveTo2X1();
		turnLeft();
	}
	
	private void goTo3X2(){
		move();
		turnLeft();
		move();
	}
	
	private void copyingBackOperation(){
		while(beepersPresent()){
			turnAround();
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
		}
	}
	
	private void bringBackNBeepersFrom5X1To2X1(){
		for(int i=0; i<3; i++){
			move();
		}
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			for(int i=0; i<3; i++){
				move();
			}
			putBeeper();
			turnAround();
			for(int i=0; i<3; i++){
				move();
			}
		}
	}
}
