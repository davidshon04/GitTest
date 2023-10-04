import stanford.karel.Karel;

//9. კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

public class Problem09att1 extends Karel{

	public void run(){
		move();
		createTable();
		//bringBackStartingBeepers();
		//putMultipliedBeepers();
	}
	
	private void createTable(){
		while(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			turnRight();
			while(beepersPresent()){
				pickBeeper();
				for(int i=0; i<2; i++){
					move();
					putBeeper();
				}
			}
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
}
