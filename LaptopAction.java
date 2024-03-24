package week1.day2;

public class LaptopAction {
	
	public void switchOn()
	{
		System.out.println("Switch on the Machine");
	}
	
	public void sendEmails()
	{
		System.out.println("Send the emails to respective team");
	}
	
	public void toPayments()
	{
		System.out.println("Do transaction to respective company");
	}
	
	public void checkingProjectReports()
	{
		System.out.println("Verify the project reports");
	}
	
	public void watchingMovies()
	{
		System.out.println("Watching my Favourite Movie");
	}
	
	
	public void watchingSports()
	{
		System.out.println("Watching my Favourite Sport");
	}
	public void hearingMusic()
	{
		System.out.println("Watching my Favourite songs");
	}
	public void playingGames()
	{
		System.out.println("Watching my Favourite Games");
	}
    
	public void switchOff()
	{
		System.out.println("Shutdown myLaptop now");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LaptopAction myLaptop=new LaptopAction();
		myLaptop.switchOn();
		myLaptop.sendEmails();
		myLaptop.checkingProjectReports();
		myLaptop.hearingMusic();
		myLaptop.playingGames();
		myLaptop.watchingSports();
		myLaptop.toPayments();
		myLaptop.watchingMovies();
		myLaptop.switchOff();
	}

}
