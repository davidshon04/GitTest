import stanford.karel.Karel;

//7. კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
//სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
//სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
//ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
//თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.

public class Problem07 extends Karel {
	
	public void run(){
		if(frontIsClear()){
		while(frontIsClear()){
//ვავსებ პირველ ქუჩას ბრილიანტებით:
		while(frontIsClear()){
			if(beepersPresent()){
				move();
			}else{
			putBeeper();
			move();
			}
		}
		if(noBeepersPresent()){
			putBeeper();
		}
//პირველი ავავსე და ავდივარ ზევით:
		turnLeft();
		if(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
			}
			turnLeft();
			while(frontIsClear()){
				if(beepersPresent()){
					move();
				}else{
				putBeeper();
				move();
				}
			}
			if(noBeepersPresent()){
				putBeeper();
			}
//ავავსე მეორე ქუჩაც. ახლა ვუხვევ მარჯვნივ:
		}
		for(int i=0; i<3; i++){
			turnLeft();
		}
		if(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
			}
			for(int i=0; i<3; i++){
				turnLeft();
			}
		
		
		}
		}
	}else{
		turnLeft();
		while(frontIsClear()){
			if(beepersPresent()){
				move();
			}else{
			putBeeper();
			move();
			}
		}
		if(noBeepersPresent()){
			putBeeper();
		}
//ეს იმისთვის, რომ იმუშაოს ერთ სვეტიან სამყაროში.
	}
	}
//ვასწავლე სამი ქუჩის გავლა და ვსვამ ციკლში.

	
}

