import stanford.karel.Karel;

public class sempr7 extends Karel{
//7. კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
//სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
//სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
//ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
//თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.
	
	public void run(){
		
		while (beepersInBag()){ // next line exists
//			go to next line start position
			fillLine();
			goToNextLineStart();
		}
	}
	private void fillLine(){
		if(noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
			}
		}
	}
	
	private void goToNextLineStart(){
		turnLeft();
		move();
		turnLeft();
		while(frontIsClear()){
			move();
		}
		turnAround();
	}
	
	private void turnAround(){
		turnLeft();
		turnLeft();
	}

}


