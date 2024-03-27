package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		ChromeDriver  driver= new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		String title = driver.getTitle();
		System.out.println("Title of Page :"+ title);
		
		String title2="Forgotten Password";
		if(title.contains(title2))
		{
			System.out.println("Title is Match");
		}
		else
		{
			System.out.println("Title is Not Match");
		}
		
		String currurl = driver.getCurrentUrl();
		System.out.println("The page Current URL :"+ currurl);
		
		String pagesrc = driver.getPageSource();
		System.out.println("This page source :"+ pagesrc);
		

	}

}
