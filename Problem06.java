import stanford.karel.Karel;

//6. კარელმა უნდა შეკრიბოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m 
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n+m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

public class Problem06 extends Karel{
	
	public void run(){
		move();
		while(beepersPresent()){
		if(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			putBeeper();		
			turnAround();
			move();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			if(beepersPresent()){
			pickBeeper();
		}
			move();
			putBeeper();
			turnAround();
			move();
		}
	}
	}
	private void turnAround(){
		turnLeft();
		turnLeft();
	}
}