package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandleLeadMerge {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications","start-maximized","--Incognito");
		ChromeDriver driver =new ChromeDriver(options);

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		//Parent Window
		String parentWindow = driver.getWindowHandle();
		//Move To Child Window
		Set<String> openedWindow = driver.getWindowHandles();
		System.out.println("Total Windows count: "+ openedWindow.size());
		//Create a empty list,converted the set into list
		List<String> childWindowFrom=new ArrayList<String>(openedWindow);
		
		driver.switchTo().window(childWindowFrom.get(1));
		String childTitleFrom = driver.getTitle();
		System.out.println("Child Window_From Title: "+ childTitleFrom);
		
		//click the First result for From-Child window
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a)[1]")).click();
		//control move to parent window
		//driver.switchTo().window(parentWindow);
		driver.switchTo().window(childWindowFrom.get(0));
		Thread.sleep(3000);
		//Click on ChildWindow_To
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> openedWindow2 = driver.getWindowHandles();
		System.out.println("Total Windows count: "+ openedWindow2.size());
        List<String> childWindowTo=new ArrayList<String>(openedWindow2);
		
		driver.switchTo().window(childWindowTo.get(1));
		String childTitleTo = driver.getTitle();
		System.out.println("Child Window_To Title: "+ childTitleTo);
		//click the Second result for From-Child window
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a)[2]")).click();
		//control again move to parent window
		driver.switchTo().window(childWindowFrom.get(0));
		Thread.sleep(3000);
		//Click on Merge btn
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//Handle Alert Popup
		Alert alertmsg = driver.switchTo().alert();
		Thread.sleep(3000);
		alertmsg.accept();
		System.out.println("Title of View Contact Page: "+ driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}

}
