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
		//carryNMinusM();
		//bringBackBeepers();
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
}
