import stanford.karel.Karel;

//6. კარელმა უნდა შეკრიბოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m 
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n+m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

public class Problem06 extends Karel{
	
	public void run(){
		move();
//ვიღებ ბრილიანტებს სათითაოდ 2x1 უჯრიდან და გადამაქვს 4x1-სა და 5x1-ზე.		
		while(beepersPresent()){
		if(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			move();
			turnAround();
		}
	}
//ვაბრუნებ ბიფერებს ადგილზე:	
		for(int i=0; i<3; i++){
			move();
		}
		while(beepersPresent()){
			if(beepersPresent()){
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
		
		turnAround();
		move();
		move();
		turnAround();
		while(beepersPresent()){
			if(beepersPresent()){
				pickBeeper();
				move();
				putBeeper();
				move();
				putBeeper();
				turnAround();
				move();
				move();
				turnAround();
			}
		}
		move();
		move();
		while(beepersPresent()){
			if(beepersPresent()){
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
		move();
		}
	private void turnAround(){
		turnLeft();
		turnLeft();
	}
}
