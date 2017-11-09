package Pune;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fullscreen {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("Webdriver.chrome.driver", "/Ram/driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement text = driver.findElement(By.xpath("//input[@id='identifierId']"));
				text.click();
				Thread.sleep(5000);
		text.sendKeys("abhayseth785ec@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	 	
		WebElement pw = driver.findElement(By.xpath("//input[@name='password']"));
		pw.sendKeys("2125222");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	//	String s= driver.getPageSource();
	//	System.out.println(s);

		
		
		
		
	//Dimension d=new Dimension(400,400);
		
	//driver.manage().window().setSize(d);
		
	//Thread.sleep(3000);
		
//	driver.manage().window().maximize();
		
		//driver.close();
		
	}

}
