import stanford.karel.Karel;

//2. კარელი დგას 1x1 უჯრაზე. 5x1 უჯრაზე დევს 10 ცალი ბრილიანტი, კარელმა ათივე
//ბრილიანტი უნდა გადაიტანოს 6x1 უჯრაზე.
public class Problem02 extends Karel{
	
	public void run(){
		move();
		move();
		move();
		move();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		move();	
	}

}
