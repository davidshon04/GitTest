import stanford.karel.Karel;

//6. კარელმა უნდა შეკრიბოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m 
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n+m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

public class Problem06att2 extends Karel{
	
	public void run(){
		move();
		pickAndPutDoubled();
		bringBackExtraBeepers();
		pickAndPutDoubled();
		bringBackExtraBeepers();
	}
	
	private void pickAndPutDoubled(){
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
	
	private void turnAround(){
		turnLeft();
		turnLeft();
	}
	
	private void bringBackExtraBeepers(){
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
		while(noBeepersPresent()){
			turnAround();
			move();
			move();
			turnAround();
		}
	}

}
