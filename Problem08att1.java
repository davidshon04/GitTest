import stanford.karel.Karel;

//8. კარელმა უნდა გამოაკლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n-m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს და ჩათვალეთ, რომ n>=m.

public class Problem08att1 extends Karel{
	
	public void run(){
		for(int i=0; i<2; i++){
			move();
		}
		carryMBeepers();
		carryNMinusM();
		bringBackMBeepers();
		bringBackNMinusM();
	}

	private void carryMBeepers(){
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
		}
	}
	
	private void turnAround(){
		turnLeft();
		turnLeft();
	}
	
	private void carryNMinusM(){
		turnAround();
		move();
		turnAround();
		while(beepersPresent()){
			pickBeeper();
			move();
			for(int i=0; i<2; i++){
				move();
				putBeeper();
			}
			turnAround();
			for(int i=0; i<3; i++){
				move();
			}
			turnAround();
		}
	}
	
	private void bringBackMBeepers(){
		turnAround();
		move();
		turnAround();
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
	
	private void bringBackNMinusM(){
		for(int i=0; i<4; i++){
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
