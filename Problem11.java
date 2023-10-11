import stanford.karel.Karel;

//11. მოცემული გაქვთ სამყარო შემთხვევითად განლაგებული კედლებით. კარელი დგას 1x1 
//უჯრაზე. თქვენი მიზანია კარელი მიიყვანოთ სამყაროს მარჯვენა ზედა კუთხეში. ჩათვალეთ, 
//რომ კედლები ისეა განლაგებული, რომ გზა არსებობს.

public class Problem11 extends Karel{
	public void run(){
//მინდა, რომ კარელმა მარჯვენა ხელი მიადოს კედელს და ასე გაუყვეს ბილიკს.
		while(noBeepersPresent()){
			while(rightIsBlocked()){
				if(frontIsBlocked()){
					turnLeft();
					move();
					turnRight();
				}
				move();
				turnRight();
				move();
			}
		}
	}
	
	private void turnRight(){
		for(int i=0; i<3; i++){
			turnLeft();
		}
	}

}
