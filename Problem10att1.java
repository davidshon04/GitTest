import stanford.karel.Karel;

//10. კარელმა უნდა გაყოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m 
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n / m ბრილიანტი. ჩათვალეთ, რომ n 
//ზუსტად იყოფა m-ზე და კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

public class Problem10att1 extends Karel{
	
	public void run(){
		move();
		while(beepersPresent()){
			firstDivision();
			puttingFirstDivision();
			bringingBackDividor();
		}
		bringBackNBeepers();
	}

	private void firstDivision(){
		while(beepersPresent()){
			move();
			while(beepersPresent()){
				pickBeeper();
				turnLeft();
				move();
				putBeeper();
				for(int i=0; i<2; i++){
					turnLeft();
					move();
				}	
				pickBeeper();
				turnLeft();
				for(int i=0; i<3; i++){
					move();
				}
				putBeeper();
				turnAround();
				move();
				move();
				turnAround();
			}	
		}	
	}
	
	private void puttingFirstDivision(){
		move();
		putBeeper();
		turnAround();
		move();
		move();
		turnAround();
	}
	
	private void turnAround(){
		turnLeft();
		turnLeft();
	}
	
	private void bringingBackDividor(){
		move();
		turnLeft();
		move();
		while(beepersPresent()){
			turnAround();
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
		}
		for(int i=0; i<2; i++){
			turnLeft();
			move();
		}
		turnLeft();
	}
	
	private void bringBackNBeepers(){
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
